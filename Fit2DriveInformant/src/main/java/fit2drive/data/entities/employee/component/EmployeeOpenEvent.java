package fit2drive.data.entities.employee.component;

import org.springframework.context.ApplicationEvent;



public class EmployeeOpenEvent extends ApplicationEvent{


	public EmployeeOpenEvent(Object source) {
		super(source);
	}


}
