package fit2drive;

import org.springframework.beans.factory.annotation.Autowired;

import util.spring.gui.publisher.SPublisher;
import util.spring.gui.publisher.ids.SComponentType;

public class LauncherBean {
	
	@Autowired SPublisher spublisher;

	public void start() {
		
		spublisher.openComponent(SComponentType.HOME);
		
	}

}
