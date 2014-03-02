package fit2drive.gui.home;

import org.springframework.beans.factory.annotation.Autowired;

import util.spring.gui.component.SBaseComponent;
import util.spring.gui.component.SBaseController;
import util.spring.gui.publisher.SPublisher;
import util.spring.gui.publisher.ids.SComponentType;

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
