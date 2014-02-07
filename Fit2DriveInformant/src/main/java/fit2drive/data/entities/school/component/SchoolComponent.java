package fit2drive.data.entities.school.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;

import fit2drive.data.entities.school.dao.SchoolDao;

public class SchoolComponent implements ApplicationListener<ApplicationEvent> {
	
	@Autowired
	SchoolDao dao;
	
	@Autowired
	ApplicationEventPublisher publisher;
	
	SchoolController controller = null;

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		
		if (event instanceof SchoolOpenEvent) {
			createController();
		} else if (event instanceof SchoolCloseEvent) {
			destroyController();
		}
		
	}
	
	private void createController() {
		if (controller == null) {
			SchoolDataView view = new SchoolDataView();
			SchoolModel model = new SchoolModel(dao);
			this.controller = new SchoolController(model, view, publisher);
			controller.run();
			return;
		} else if (controller != null && controller.isFormOpen()) {
			System.out.println("Form already open.");
			return;
		} else if(controller != null && !controller.isFormOpen()) {
			this.controller.setVisible();
			return;
		}
	}
	
	private void destroyController() {
		if (controller == null) {
			System.out.println("Controller is already closed.");
		} else if (controller != null && controller.isFormOpen()) {
			controller.displose();
			controller = null;
		} else if(controller != null && !controller.isFormOpen()) {
			controller.displose();
			controller = null;
		}
	}
	

}
