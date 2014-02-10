package fit2drive.gui.home;

import org.springframework.context.ApplicationEvent;

public class HomeCloseEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	public HomeCloseEvent(Object source) {
		super(source);
	}

}
