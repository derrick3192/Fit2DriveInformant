package fit2drive.gui.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import util.spring.gui.component.SBaseComponent;
import util.spring.gui.component.SBaseController;
import util.spring.gui.component.SComponentType;

public class HomeComponent extends SBaseComponent{
	
	
	public HomeComponent() {
		super(SComponentType.HOME);
	}

	@Autowired
	ApplicationEventPublisher publisher;
	
	@Override
	protected SBaseController createController() {
		return new HomeController(new HomeView(), new HomeModel(publisher));
	}

}
