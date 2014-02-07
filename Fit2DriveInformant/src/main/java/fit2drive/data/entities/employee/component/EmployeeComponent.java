package fit2drive.data.entities.employee.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;

import fit2drive.data.entities.employee.dao.EmployeeDao;



public class EmployeeComponent implements ApplicationListener<ApplicationEvent> {
	
	@Autowired
	EmployeeDao dao;
	
	@Autowired
	ApplicationEventPublisher publisher;

	EmployeeController controller = null;
	
	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		
		if (arg0 instanceof EmployeeOpenEvent) {
			createController();
		} else if (arg0 instanceof EmployeeCloseEvent) {
			destroyController();
		}
	}
	
	
	private void createController() {
		if (controller == null) {
			EmployeeDataView view = new EmployeeDataView();
			EmployeeModel model = new EmployeeModel(dao);
			this.controller = new EmployeeController(model, view, publisher);
			controller.run();
		} else if (controller != null && controller.isFormOpen()) {
			System.out.println("Form already open.");
		} else if(controller != null && !controller.isFormOpen()) {
			this.controller.setVisible();
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
