package fit2drive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import fit2drive.data.entities.employee.component.EmployeeOpenEvent;
import fit2drive.data.entities.school.component.SchoolOpenEvent;



public class MainBean {

	@Autowired
	ApplicationEventPublisher publisher;

	public void start() {
		this.publisher.publishEvent(new EmployeeOpenEvent(this));
		this.publisher.publishEvent(new EmployeeOpenEvent(this));
		this.publisher.publishEvent(new EmployeeOpenEvent(this));
		this.publisher.publishEvent(new EmployeeOpenEvent(this));
		this.publisher.publishEvent(new EmployeeOpenEvent(this));
		
		this.publisher.publishEvent(new SchoolOpenEvent(this));
		this.publisher.publishEvent(new SchoolOpenEvent(this));
		this.publisher.publishEvent(new SchoolOpenEvent(this));
		this.publisher.publishEvent(new SchoolOpenEvent(this));
		this.publisher.publishEvent(new SchoolOpenEvent(this));
		
	}

}
