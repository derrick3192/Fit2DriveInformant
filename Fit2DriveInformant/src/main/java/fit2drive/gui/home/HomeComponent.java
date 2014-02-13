package fit2drive.gui.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import util.spring.gui.component.SComponent;
import util.spring.gui.component.SIController;

public class HomeComponent extends SComponent{
	
	
	@Autowired
	ApplicationEventPublisher publisher;
	
	@Override
	protected SIController createController() {
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
