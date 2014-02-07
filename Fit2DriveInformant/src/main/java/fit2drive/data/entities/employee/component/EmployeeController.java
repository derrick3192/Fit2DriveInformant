package fit2drive.data.entities.employee.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JScrollPane;

import org.springframework.context.ApplicationEventPublisher;

import fit2drive.data.controller.AbstractController;

public class EmployeeController extends AbstractController {

	EmployeeModel model;
	EmployeeDataView view;
	ApplicationEventPublisher publisher;

	private EmployeeController(
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
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				publisher.publishEvent(new EmployeeCloseEvent(null));
			}
		});
		
	}


	public EmployeeController(
			EmployeeModel model2,
			EmployeeDataView view2,
			ApplicationEventPublisher publisher) {
		this(model2, view2);
		this.publisher = publisher;
	}


	public class createBtnAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			model.saveEntity(view.getData());
		}
	}

	
	public void displose() {
		this.frame.dispose();
	}
	
	public void setVisible() {
		this.frame.setVisible(true);
	}

	boolean isFormOpen() {
		return this.frame.isVisible();
	}



}
