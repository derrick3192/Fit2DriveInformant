package fit2drive.data.entities.school.component;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import util.spring.gui.component.SBaseController;


public class SchoolController extends SBaseController {
	
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
