package fit2drive.data.entities.school.component;

import org.springframework.context.ApplicationEvent;

public class SchoolOpenEvent extends ApplicationEvent{

	private static final long serialVersionUID = 1L;

	public SchoolOpenEvent(Object source) {
		super(source);
	}

}
