package fit2drive.data.controller;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public abstract class AbstractController {
	
	private static volatile boolean frameClosed=true;
	
	protected JFrame frame = new JFrame();
	
	
	public AbstractController() {
		initComponents();
	}
	
	public static synchronized boolean isFrameClosed() {
		return frameClosed;
	}
	
	private void initComponents() {
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(600,600);

		frame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				frameClosed = true;
			}
		});
	}
	
	public synchronized void run() {
		frameClosed = false;
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frame.setVisible(true);
			}
		});
	}


}
