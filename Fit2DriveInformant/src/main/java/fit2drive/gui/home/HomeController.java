package fit2drive.gui.home;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import util.spring.gui.component.SController;

public class HomeController extends SController{
	
	final HomeModel model;

	public HomeController(HomeView view, final HomeModel model) {
		super(view);
		this.model = model;
		
		view.addActionListener(HomeView.Menuitems.EMPLOYEE, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				model.publishEmployeeOpenEvent();
			}
		});
		
		view.addActionListener(HomeView.Menuitems.SCHOOL, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				model.publishSchoolOpenEvent();
			}
		});
		
	}

}
