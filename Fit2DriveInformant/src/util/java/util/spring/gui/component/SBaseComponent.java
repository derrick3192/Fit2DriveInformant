package util.spring.gui.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;



/**
 * @author Derrick
 * 
 * 
 * Class for wrapping controllers into the Spring Framework. This decouples GUI forms from one
 * another.
 *
 */
public abstract class SBaseComponent implements ApplicationListener<ApplicationEvent> {

	/** Controller of the component **/
	private SBaseController controller;
	
	@Autowired
	ApplicationEventPublisher publisher;
	
	protected abstract SBaseController createController();
	
	/** Open the form if it is not already open. Or make the form visible if it is hidden. **/
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
	
	/** Close the Form and help dispose of resources. **/
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
	
	/** Class of the ApplicationEvent which will invoke the <c>close()</c> method on this form. **/
	protected abstract Class<?> closeClass();
	
	/** Class of the ApplicationEvent which will invoke the <c>open()</c> method on this form. **/
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
