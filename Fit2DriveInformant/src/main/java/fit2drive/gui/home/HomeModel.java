package fit2drive.gui.home;

import org.springframework.context.ApplicationEventPublisher;

import util.spring.gui.component.SEventType;
import util.spring.gui.component.SComponentEvent;
import util.spring.gui.component.SComponentType;

public class HomeModel {
	
	ApplicationEventPublisher publisher;
	
	
	public HomeModel(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	public void publishEmployeeOpenEvent() {
		publisher.publishEvent(new SComponentEvent(this, SComponentType.EMPLOYEE, SEventType.OPENING));
	}
	
	
	public void publishSchoolOpenEvent() {
		publisher.publishEvent(new SComponentEvent(this, SComponentType.EMPLOYEE, SEventType.OPENING));
	}
	
}
