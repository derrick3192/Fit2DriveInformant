package fit2drive.data.entities.employee.component;

import org.springframework.context.ApplicationEvent;



public class EmployeeOpenEvent extends ApplicationEvent{


	private static final long serialVersionUID = 1L;

	public EmployeeOpenEvent(Object source) {
		super(source);
	}


}
