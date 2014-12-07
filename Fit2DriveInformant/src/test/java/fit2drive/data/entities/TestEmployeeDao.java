package fit2drive.data.entities;

import java.util.Arrays;

import fit2drive.data.DaoImpTest;
import fit2drive.data.entities.employee.Employee;
import fit2drive.data.entities.employee.EmployeeData;
import fit2drive.data.entities.employee.dao.EmployeeDaoImp;
import static org.junit.Assert.*;

import org.junit.Test;


public class TestEmployeeDao extends DaoImpTest<Employee, EmployeeData, EmployeeDaoImp> {


	
	
	/**
	 * Test that the photo is saving correctly.
	 */
	@Test
	public void testPhotoIsSaving() {
		
		assertTrue(dao != null);
		
		Employee employeeSaved = dao.createValidEntity();
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
		Employee employeeSaved = dao.createValidEntity();
		dao.save(employeeSaved);
		int id = employeeSaved.getId();
		
		Employee employeeRetrieved = dao.get(id);
		
		
		assertTrue(
				"This array should not have been loaded",
				employeeRetrieved.getPicture().getFileAsBytes().length == 0);

	}
	
	
	/**
	 * This method tests that the test is indeed using a valid picture, other tests rely on this method.
	 */
	@Test
	public void testPic() {
		assertTrue(
				"Error, this array should not be 0 for the test",
				dao.getDataFile().getFileAsBytes().length != 0);
	}


	


}
