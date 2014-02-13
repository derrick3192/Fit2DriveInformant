package fit2drive.data.entities.school.component;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import util.spring.gui.component.SIController;


public class SchoolController extends SIController {
	
	public SchoolController(final SchoolModel model, final SchoolDataView view) {
		super(view);
		
		view.addBtnReadyActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				model.saveEntity(view.getData());
			}
		});
	}

}
