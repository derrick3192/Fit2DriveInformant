package util.spring.gui.component;

import org.springframework.context.ApplicationListener;

import util.spring.gui.publisher.ids.SComponentType;



/**
 * @author Derrick
 * 
 * 
 * Class for wrapping controllers into the Spring Framework. This decouples GUI forms from one
 * another.
 *
 */
public abstract class SBaseComponent implements ApplicationListener<SComponentEvent> {

	/** Controller of the component **/
	private SBaseController controller;

	public final SComponentType componentType;

	protected abstract SBaseController createController();

	public SBaseComponent(SComponentType componentType) {
		this.componentType = componentType;
	}

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

	@Override
	final public void onApplicationEvent(SComponentEvent event) {

		if (event.getComponentType() == this.componentType) {

			switch(event.getSEventType()) {
			
			case CLOSING:
				closeForm();
				break;
			case OPENING:
				openForm();
				break;
			default:
				break;
			}
			
		}


	}
}
