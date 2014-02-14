package fit2drive.data.entities.employee.component;

import org.springframework.beans.factory.annotation.Autowired;


import util.spring.gui.component.SComponent;
import util.spring.gui.component.SIView;
import fit2drive.data.dao.Dao;
import fit2drive.data.entities.employee.Employee;
import fit2drive.data.entities.employee.EmployeeData;
import fit2drive.data.entities.employee.dao.EmployeeDao;



public class EmployeeComponent extends SComponent<Employee, EmployeeData> {
	
	@Autowired
	public EmployeeComponent(EmployeeDao dao) {
		this(EmployeeOpenEvent.class, EmployeeCloseEvent.class, dao);
	}
	
	
	public EmployeeComponent(Class<EmployeeOpenEvent> open, Class<EmployeeCloseEvent> close,
			Dao<Employee, EmployeeData> dao) {
		super(open, close, dao);
	}
	
	
	@Override
	protected SIView<EmployeeData> createView() {
		return new EmployeeDataView();
	}


	
	

}
