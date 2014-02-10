package util.spring.gui.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;



public abstract class SComponent
	implements ApplicationListener<ApplicationEvent> {
	
	private SController controller;
	
	@Autowired
	ApplicationEventPublisher publisher;
	
	protected abstract SController createController();
	
	
	protected void openForm() {
		if (controller == null) {
			this.controller = createController();
			this.controller.run();
			this.controller.focusFrame();
			return;
		} else if (controller != null && controller.isFormOpen()) {
			System.out.println("Form already open");
			this.controller.focusFrame();
			return;
		} else if (controller != null && !controller.isFormOpen()) {
			this.controller.setVisible();
			this.controller.focusFrame();
			return;
		}
	}
	
	protected void closeForm() {
		if (controller == null) {
			System.out.println("Controller is already closed.");
		} else if (controller != null && controller.isFormOpen()) {
			controller.dispose();
			controller = null;
		} else if (controller != null && !controller.isFormOpen()) {
			controller.dispose();
			controller = null;
		}
	}
	
	// open and close events;
	protected abstract Class<?> closeClass();	
	protected abstract Class<?> openClass();
	
	@Override
	final public void onApplicationEvent(ApplicationEvent event) {
		
		if (event.getClass() == openClass()) {
			openForm();
			return;
		} else if(event.getClass() == closeClass()) {
			closeForm();
			return;
		}
	}
}
