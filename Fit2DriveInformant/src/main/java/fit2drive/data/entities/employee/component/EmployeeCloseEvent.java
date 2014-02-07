package fit2drive.data.entities.employee.component;

import org.springframework.context.ApplicationEvent;

public class EmployeeCloseEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	public EmployeeCloseEvent(Object source) {
		super(source);
	}

}
