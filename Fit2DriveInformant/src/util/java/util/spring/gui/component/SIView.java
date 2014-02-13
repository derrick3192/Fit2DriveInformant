package util.spring.gui.component;

import java.awt.event.ActionListener;

/**
 * @author Derrick
 * 
 * Class which is a controller.
 *
 */
public interface SIView<Data> {
	
	/** Get the input data **/
	public Data getData();
	
	
	/** Add the actionListener for getting the user input to the view. **/
	public void addBtnReadyActionListener(ActionListener al);
}
