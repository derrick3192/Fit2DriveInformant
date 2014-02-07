package fit2drive.data.controller;

import java.awt.event.WindowAdapter;

import javax.swing.JFrame;

public abstract class AbstractController {
	
	protected JFrame frame = new JFrame();
	
	
	public AbstractController() {
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
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frame.setVisible(true);
			}
		});
	}


}
