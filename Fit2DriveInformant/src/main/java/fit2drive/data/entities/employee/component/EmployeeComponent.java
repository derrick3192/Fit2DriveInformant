package fit2drive.data.entities.employee.component;

import org.springframework.beans.factory.annotation.Autowired;

import util.spring.gui.component.SComponent;
import util.spring.gui.component.SIView;
import util.spring.gui.publisher.ids.SComponentType;
import fit2drive.data.entities.employee.Employee;
import fit2drive.data.entities.employee.EmployeeData;
import fit2drive.data.entities.employee.dao.EmployeeDao;


public class EmployeeComponent extends SComponent<Employee, EmployeeData> {
	
	@Autowired
	public EmployeeComponent(EmployeeDao dao) {
		super(dao, SComponentType.EMPLOYEE);
	}
	
	
	@Override
	protected SIView<EmployeeData> createView() {
		return new EmployeeDataView();
	}


	
	

}
