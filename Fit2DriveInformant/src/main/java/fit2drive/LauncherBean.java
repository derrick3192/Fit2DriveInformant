package fit2drive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import util.spring.gui.component.SEventType;
import util.spring.gui.component.SComponentEvent;
import util.spring.gui.component.SComponentType;

public class LauncherBean {

	@Autowired
	ApplicationEventPublisher publisher;

	public void start() {
		this.publisher.publishEvent(new SComponentEvent(this, SComponentType.HOME, SEventType.OPENING));
	}

}
