package util.spring.gui.component;

import java.awt.event.WindowAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;



public abstract class SController {

	JFrame frame = new JFrame();


	public SController(JFrame frame) {
		this.frame = frame;
		initComponents();
	}
	
	public SController() {
		initComponents();
	}
	
	public SController(JPanel panel) {
		this.frame.add(panel);
		initComponents();
	}
	
	
	public void addWindowListener(WindowAdapter w) {
		frame.addWindowListener(w);
	}


	private void initComponents() {
		//this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(600,600);
	}

	public synchronized void run() {
		if (!frame.isVisible()){
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					frame.setVisible(true);
				}
			});
		}
	}

	public void dispose() {
		this.frame.dispose();
	}

	public void setVisible() {
		this.frame.setVisible(true);
	}

	public boolean isFormOpen() {
		return this.frame.isVisible();
	}
	
	public void focusFrame() {
		this.frame.toFront();
	}
	


}