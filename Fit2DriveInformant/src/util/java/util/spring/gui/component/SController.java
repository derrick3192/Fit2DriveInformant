package util.spring.gui.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
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

				try {
					if (model.saveEntity(view.getData())) {
						JOptionPane.showMessageDialog(null,
								"Successfully Created Entity!",
								"Created Entity",
								JOptionPane.INFORMATION_MESSAGE);
					}
				} catch (SModelSavingException e1) {
					
					JOptionPane.showMessageDialog(null,
							e1.getMessage(),
							"ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		

	}
}
