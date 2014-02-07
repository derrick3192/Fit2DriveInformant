package fit2drive.data.entities.school.component;

import org.springframework.context.ApplicationEvent;

public class SchoolCloseEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SchoolCloseEvent(Object source) {
		super(source);
	}

}
