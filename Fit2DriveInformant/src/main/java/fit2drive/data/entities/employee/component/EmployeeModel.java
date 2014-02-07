package fit2drive.data.entities.employee.component;

import fit2drive.data.entities.employee.Employee;
import fit2drive.data.entities.employee.EmployeeData;
import fit2drive.data.entities.employee.dao.EmployeeDao;

public class EmployeeModel{
	
	EmployeeDao dao;
	
	public EmployeeModel(EmployeeDao dao) {
		this.dao = dao;
	}
	
	public void saveEntity(EmployeeData employeeData) {
		Employee employee = Employee.createInstance(employeeData);
		dao.save(employee);
	}
	
}
