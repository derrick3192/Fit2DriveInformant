package fit2drive.data.entities.employee.component;

import util.spring.gui.component.SIModel;
import fit2drive.data.entities.employee.Employee;
import fit2drive.data.entities.employee.EmployeeData;
import fit2drive.data.entities.employee.dao.EmployeeDao;

public class EmployeeModel implements SIModel<EmployeeData> {
	
	EmployeeDao dao;
	
	EmployeeModel(EmployeeDao dao) {
		this.dao = dao;
	}
	
	public void saveEntity(EmployeeData data) {
		Employee employee = dao.createEntity(data);
		dao.save(employee);
	}
	
}
