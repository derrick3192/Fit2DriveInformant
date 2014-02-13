package fit2drive.data.entities.employee.component;

import util.spring.gui.component.SModel;
import fit2drive.data.entities.employee.Employee;
import fit2drive.data.entities.employee.EmployeeData;
import fit2drive.data.entities.employee.dao.EmployeeDao;

public class EmployeeModel extends SModel<Employee, EmployeeData> {
	
	EmployeeDao dao;
	
	EmployeeModel(EmployeeDao dao) {
		super(dao);
	}
	
}
