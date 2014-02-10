package fit2drive.gui.home;

import org.springframework.context.ApplicationEventPublisher;

import fit2drive.data.entities.employee.component.EmployeeOpenEvent;
import fit2drive.data.entities.school.component.SchoolOpenEvent;

public class HomeModel {
	
	ApplicationEventPublisher publisher;
	
	
	public HomeModel(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	public void publishEmployeeOpenEvent() {
		publisher.publishEvent(new EmployeeOpenEvent(this));
	}
	
	
	public void publishSchoolOpenEvent() {
		publisher.publishEvent(new SchoolOpenEvent(this));
	}
	
}
