package fit2drive.gui.home;

import org.springframework.beans.factory.annotation.Autowired;

import util.spring.gui.component.SBaseComponent;
import util.spring.gui.component.SBaseController;
import util.spring.gui.publisher.SComponentType;
import util.spring.gui.publisher.SPublisher;

public class HomeComponent extends SBaseComponent{
	
	
	public HomeComponent() {
		super(SComponentType.HOME);
	}

	@Autowired
	SPublisher spublisher;
	
	@Override
	protected SBaseController createController() {
		return new HomeController(new HomeView(), new HomeModel(spublisher));
	}

}
