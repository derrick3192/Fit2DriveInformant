package fit2drive.data.entities.employee.dao;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

import fit2drive.data.DaoImpTest;
import fit2drive.data.entities.employee.Employee;
import fit2drive.data.entities.employee.dao.EmployeeDaoImp;
import fit2drive.data.members.address.Address;
import fit2drive.data.members.datafile.DataFile;
import static org.junit.Assert.*;

import org.junit.Test;

import resource.ResourceLoaderTestResources;

public class TestEmployeeDao extends DaoImpTest<Employee, EmployeeDaoImp> {
	
	private static final String picturePathValid 	= ResourceLoaderTestResources.getImagePath(ResourceLoaderTestResources.ListFiles.TESTPICTURE);
	private static final String pictureFileName 	= "Penguin2";
	private static final String pictureExtension 	= "jpg";


	@Override
	public Employee createValidEntity() {
		
		Employee employee = new Employee(
				"sim",
				new Date(),
				new Address(
						"glebe",
						"cheltenham",
						3192));
		
		employee.setPicture(this.getDataFile());
		
		return employee;
	}
	
	
	@Test
	public void testPhotoIsSaving() {
		
		Employee employeeSaved = this.createValidEntity();
		dao.save(employeeSaved);
		int id = employeeSaved.getId();
		
		Employee employeeRetrieved = dao.getInitialized(id);
		
		assertTrue("The arrays containing the pictures should be the same",
				Arrays.equals(employeeSaved.getPicture().getFileAsBytes(), employeeRetrieved.getPicture().getFileAsBytes()));
		
		dao.delete(employeeSaved);
		
	}
	
	
	/** Test the the photos are loaded lazy so that there is not such a large cost with loading
	 * employees from the database */
	@Test(expected = Exception.class)
	public void testPhotoLoadedLazy() {
		Employee employeeSaved = this.createValidEntity();
		dao.save(employeeSaved);
		int id = employeeSaved.getId();
		
		Employee employeeRetrieved = dao.get(id);
		
		
		assertTrue(
				"This array should not have been loaded",
				employeeRetrieved.getPicture().getFileAsBytes().length == 0);

	}
	
	@Test
	public void testPic() {
		assertTrue(
				"Error, this array should not be 0 for the test",
				getDataFile().getFileAsBytes().length != 0);
	}

	
	/**
	 * Get an example picture file
	 * @return
	 */
	private DataFile getDataFile() {
		File pic_file = new File(picturePathValid);
		return new DataFile(pictureFileName,pictureExtension, pic_file);
	}



	


}
