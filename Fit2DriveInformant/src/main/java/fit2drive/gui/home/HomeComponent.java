package fit2drive.gui.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import util.spring.gui.component.SBaseComponent;
import util.spring.gui.component.SBaseController;

public class HomeComponent extends SBaseComponent{
	
	
	@Autowired
	ApplicationEventPublisher publisher;
	
	@Override
	protected SBaseController createController() {
		return new HomeController(new HomeView(), new HomeModel(publisher));
	}

	@Override
	protected Class<?> closeClass() {
		return HomeCloseEvent.class;
	}

	@Override
	protected Class<?> openClass() {
		return HomeOpenEvent.class;
	}

}
