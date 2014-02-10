package fit2drive.data.entities.school.component;

import org.springframework.context.ApplicationEvent;

public class SchoolCloseEvent extends ApplicationEvent {


	public SchoolCloseEvent(Object source) {
		super(source);
	}

}
