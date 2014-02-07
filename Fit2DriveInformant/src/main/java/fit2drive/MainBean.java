package fit2drive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import fit2drive.data.entities.employee.component.EmployeeController;
import fit2drive.data.entities.employee.component.EmployeeOpenEvent;



public class MainBean {
	
	@Autowired
	ApplicationEventPublisher publisher;
	
	public void start() {
		if (EmployeeController.isFrameClosed()) {
			this.publisher.publishEvent(new EmployeeOpenEvent(this));
		}
	}
	
}
