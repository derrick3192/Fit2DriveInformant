package fit2drive.gui.home;


import util.spring.gui.publisher.SPublisher;
import util.spring.gui.publisher.ids.SComponentType;

public class HomeModel {
	
	
	final SPublisher spublisher;
	
	public HomeModel(SPublisher spublisher) {
		this.spublisher = spublisher;
	}
	
	public void publishEmployeeOpenEvent() {
		spublisher.openComponent(SComponentType.EMPLOYEE);
	}
	
	
	public void publishSchoolOpenEvent() {
		spublisher.openComponent(SComponentType.SCHOOL);
	}
	
}
