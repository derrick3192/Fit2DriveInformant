package fit2drive.data.entities.employee.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;

import fit2drive.data.controller.AbstractController;

public class EmployeeController extends AbstractController {

	private static volatile boolean frameClosed=true;

	public static synchronized boolean isFrameClosed() {
		return frameClosed;
	}

	EmployeeModel model;
	EmployeeDataView view;

	public EmployeeController(
			EmployeeModel model,
			EmployeeDataView view) {
		super();


		this.model = model;
		this.view = view;

		// add button action listener
		this.view.addBtnReadyActionListener(new createBtnAction());

		JScrollPane jscrollPane = new JScrollPane(this.view);
		//jscrollPane.add(view);
		this.frame.add(jscrollPane);
	}


	public class createBtnAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			model.saveEntity(view.getData());
		}
	}






}
