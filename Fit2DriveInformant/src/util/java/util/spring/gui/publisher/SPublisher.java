package util.spring.gui.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import util.spring.gui.component.SComponentEvent;
import util.spring.gui.component.SEventType;


public class SPublisher {
	
	@Autowired
	ApplicationEventPublisher publisher;
	
	
	public void openComponent(SComponentType component) {
		publisher.publishEvent(new SComponentEvent(this, component, SEventType.OPENING));
	}
	
	public void closeComponent(SComponentType component) {
		publisher.publishEvent(new SComponentEvent(this, component, SEventType.CLOSING));
	}

}
