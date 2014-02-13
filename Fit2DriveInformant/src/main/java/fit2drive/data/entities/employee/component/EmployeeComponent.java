package fit2drive.data.entities.employee.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import util.spring.gui.component.SComponent;
import util.spring.gui.component.SIController;
import fit2drive.data.entities.employee.dao.EmployeeDao;



public class EmployeeComponent extends SComponent {
	
	@Autowired
	EmployeeDao dao;
	
	@Autowired
	ApplicationEventPublisher publisher;


	@Override
	protected SIController createController() {
		return new EmployeeController(new EmployeeModel(dao), new EmployeeDataView());
	}

	@Override
	protected Class<?> closeClass() {
		return EmployeeCloseEvent.class;
	}

	@Override
	protected Class<?> openClass() {
		return EmployeeOpenEvent.class;
	}
	

	
	

}
