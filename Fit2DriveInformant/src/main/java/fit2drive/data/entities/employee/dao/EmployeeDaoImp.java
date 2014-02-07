package fit2drive.data.entities.employee.dao;


import image.ImageUtils;

import java.awt.Image;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import fit2drive.data.dao.DaoImp;
import fit2drive.data.entities.employee.Employee;
import fit2drive.data.entities.employee.EmployeeData;
import fit2drive.data.tables.DataColumn;


public class EmployeeDaoImp extends DaoImp<Employee> implements EmployeeDao {
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
	protected DataColumn[] createDataColumns() {
		// TODO Auto-generated method stub
		return new DataColumn[]{new DataColumn(Integer.class, "sdfds", true)};
	}
	
	public Employee createInstance(EmployeeData data) {
		return Employee.createInstance(data);
	}
	
}
