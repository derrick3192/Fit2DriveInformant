package fit2drive.data.entities.employee.component;

import fit2drive.data.entities.employee.Employee;
import fit2drive.data.entities.employee.EmployeeData;
import fit2drive.data.entities.employee.dao.EmployeeDao;

public class EmployeeModel {
	
	EmployeeDao dao;
	
	EmployeeModel(EmployeeDao dao) {
		this.dao = dao;
	}
	
	public void saveEntity(EmployeeData data) {
		Employee employee = dao.createInstance(data);
		dao.save(employee);
	}
	
}
