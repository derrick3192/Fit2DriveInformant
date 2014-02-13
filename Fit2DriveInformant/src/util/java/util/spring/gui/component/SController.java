package util.spring.gui.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public abstract class SController<DATA, MODEL extends SIModel<DATA>, VIEW extends SIView<DATA>> extends SBaseController {

	
	final MODEL model;
	
	final VIEW view;
	
	public SController(final MODEL model, final VIEW view) {
		super((JPanel)view);
		
		
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
