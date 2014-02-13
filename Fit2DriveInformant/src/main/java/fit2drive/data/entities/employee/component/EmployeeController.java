package fit2drive.data.entities.employee.component;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import util.spring.gui.component.SIController;

public class EmployeeController extends SIController {

	final EmployeeModel model;
	
	final EmployeeDataView view;
	
	public EmployeeController(final EmployeeModel model, final EmployeeDataView view) {
		super(view);
		
		this.model = model;
		this.view = view;
		
		view.addBtnReadyActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				model.saveEntity(view.getData());
			}
		});
		
	}




}
