package fit2drive.data.entities.employee.dao;

import java.awt.Image;

import fit2drive.data.dao.Dao;
import fit2drive.data.entities.employee.Employee;
import fit2drive.data.entities.employee.EmployeeData;


public interface EmployeeDao extends Dao<Employee,EmployeeData> {
	
	/** get an employee with all of its members loaded **/
	public Employee getInitialized(int id);
	
	/** Get the image of an employee with the given ID **/
	public Image getImageFromEmployeeID(int id);
	

}
