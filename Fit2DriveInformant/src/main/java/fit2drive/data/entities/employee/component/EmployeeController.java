package fit2drive.data.entities.employee.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class EmployeeController {

	private static volatile boolean frameClosed=true;

	public static synchronized boolean isFrameClosed() {
		return frameClosed;
	}

	EmployeeModel model;
	EmployeeDataView view;
	JFrame frame = new JFrame();

	public EmployeeController(
			EmployeeModel model,
			EmployeeDataView view) {
		super();

		initComponents();


		this.model = model;
		this.view = view;

		// add button action listener
		this.view.addBtnReadyActionListener(new createBtnAction());

		JScrollPane jscrollPane = new JScrollPane(this.view);
		//jscrollPane.add(view);
		this.frame.add(jscrollPane);
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


	public class createBtnAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			model.saveEntity(view.getData());
		}
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
