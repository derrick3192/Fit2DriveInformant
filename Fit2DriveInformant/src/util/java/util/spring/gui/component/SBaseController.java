package util.spring.gui.component;

import java.awt.event.WindowAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;



/**
 * @author Derrick
 * 
 * Controller with basic functionality already coded.
 *
 */
public abstract class SBaseController {

	/** Frame which the controller controls. **/
	JFrame frame = new JFrame();


	/**
	 * Constructor to parse the view to the controller.
	 * 
	 * @param frame - view parsed to the controller.
	 */
	public SBaseController(JFrame frame) {
		this.frame = frame;
		initComponents();
	}
	
	public SBaseController() {
		initComponents();
	}
	
	/**
	 * Constructor for using a panel, which will be added to a JFrame.
	 * 
	 * @param panel - view parsed to the Controller.
	 */
	public SBaseController(JPanel panel) {
		this.frame.add(panel);
		initComponents();
	}
	
	/** Method to add a window listener to the Frame. **/
	public void addWindowListener(WindowAdapter w) {
		frame.addWindowListener(w);
	}


	/** Initialization of the form. **/
	private void initComponents() {
		//this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(600,600);
	}

	/** Method to run the form, which is syncronized to enforce that only one instance
	 * of this form will be open at any one time. **/
	public synchronized void run() {
		if (!frame.isVisible()){
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					frame.setVisible(true);
				}
			});
		}
	}

	/** Dispose of the Form **/
	public void dispose() {
		this.frame.dispose();
	}

	/** Make the Form visible **/
	public void setVisible() {
		this.frame.setVisible(true);
	}

	/** Is the Form open/visible? **/
	public boolean isFormOpen() {
		return this.frame.isVisible();
	}
	
	/** Put the Frame in focus. **/
	public void focusFrame() {
		this.frame.toFront();
	}
	


}