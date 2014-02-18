package fit2drive;

import org.springframework.beans.factory.annotation.Autowired;

import util.spring.gui.publisher.SComponentType;
import util.spring.gui.publisher.SPublisher;

public class LauncherBean {
	
	@Autowired SPublisher spublisher;

	public void start() {
		
		spublisher.openComponent(SComponentType.HOME);
		
	}

}
