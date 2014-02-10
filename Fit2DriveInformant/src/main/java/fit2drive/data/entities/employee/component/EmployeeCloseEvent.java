package fit2drive.data.entities.employee.component;

import org.springframework.context.ApplicationEvent;

public class EmployeeCloseEvent extends ApplicationEvent {

	public EmployeeCloseEvent(Object source) {
		super(source);
	}

}
