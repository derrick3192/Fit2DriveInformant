package fit2drive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import fit2drive.gui.home.HomeOpenEvent;

public class LauncherBean {

	@Autowired
	ApplicationEventPublisher publisher;

	public void start() {
		this.publisher.publishEvent(new HomeOpenEvent(this));
	}

}
