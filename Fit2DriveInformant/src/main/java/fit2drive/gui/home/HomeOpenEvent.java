package fit2drive.gui.home;

import org.springframework.context.ApplicationEvent;

public class HomeOpenEvent extends ApplicationEvent{

	private static final long serialVersionUID = 1L;

	public HomeOpenEvent(Object source) {
		super(source);
	}

}
