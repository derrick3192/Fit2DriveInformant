package fit2drive.data.entities.school.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JScrollPane;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;

import fit2drive.data.controller.AbstractController;
import fit2drive.data.entities.employee.component.EmployeeCloseEvent;
import fit2drive.data.entities.employee.component.EmployeeController.createBtnAction;

public class SchoolController extends AbstractController{
	
	SchoolModel model;
	SchoolDataView view;
	ApplicationEventPublisher publisher;
	public SchoolController(SchoolModel model, SchoolDataView view,
			final ApplicationEventPublisher publisher) {
		super();
		this.model = model;
		this.view = view;
		this.publisher = publisher;
		
		// add button action listener
		this.view.addBtnReadyActionListener(new createBtnAction());
		
		JScrollPane jscrollPane = new JScrollPane(this.view);
		//jscrollPane.add(view);
		this.frame.add(jscrollPane);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				publisher.publishEvent(new SchoolCloseEvent(null));
			}
		});
		
	}
	
	public class createBtnAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			model.saveEntity(view.getData());
		}
		
	}
	
	

}
