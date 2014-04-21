package fit2drive.data.entities.employee.dao;


import image.ImageUtils;

import java.awt.Image;
import java.io.File;
import java.util.Date;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import resource.ResourceLoaderTestResources;
import fit2drive.data.dao.DaoImp;
import fit2drive.data.entities.employee.Employee;
import fit2drive.data.entities.employee.EmployeeData;
import fit2drive.data.members.address.Address;
import fit2drive.data.members.datafile.DataFile;


public class EmployeeDaoImp extends DaoImp<Employee, EmployeeData> implements EmployeeDao {
	public EmployeeDaoImp() {	
	}
	
	@Override
	public void save(Employee entity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(entity.getPicture());
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}
	
	@Override
	public Employee getInitialized(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Employee employee = (Employee) session.get(getEntityClass(), id);
		Hibernate.initialize(employee.getPicture());
		session.close();
		
		return employee;
	}
	
	
	public Image getImageFromEmployeeID(int id) {
		return ImageUtils.createImageFromBytes(this.getInitialized(id).getPicture().getFileAsBytes()); 
	}
	
	
	@Override
	public Class<Employee> getEntityClass() {
		return Employee.class;
	}

	
	@Override
	public Employee createEntity(EmployeeData data) {
		return Employee.createInstance(data);
	}

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
	
	
	
	
	
	
	
	// Methods for picture and testing
	
	private static final String picturePathValid 	= ResourceLoaderTestResources.getImagePath(ResourceLoaderTestResources.ListFiles.TESTPICTURE);
	private static final String pictureFileName 	= "Penguin2";
	private static final String pictureExtension 	= "jpg";
	
	/**
	 * Get an example picture file
	 * @return
	 */
	public DataFile getDataFile() {
		File pic_file = new File(picturePathValid);
		return new DataFile(pictureFileName,pictureExtension, pic_file);
	}
	
	
	


	
}
