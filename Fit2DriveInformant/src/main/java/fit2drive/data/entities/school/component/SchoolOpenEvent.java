package fit2drive.data.entities.school.component;

import org.springframework.context.ApplicationEvent;

public class SchoolOpenEvent extends ApplicationEvent{

	public SchoolOpenEvent(Object source) {
		super(source);
	}

}
