package fit2drive.data.entities.school.component;

import org.springframework.beans.factory.annotation.Autowired;

import util.spring.gui.component.SComponent;
import util.spring.gui.component.SIController;
import fit2drive.data.entities.school.dao.SchoolDao;

public class SchoolComponent extends SComponent {
	
	@Autowired
	SchoolDao dao;
	
	@Override
	protected SIController createController() {
		return new SchoolController(new SchoolModel(dao), new SchoolDataView());
	}

	@Override
	protected Class<?> closeClass() {
		return SchoolCloseEvent.class;
	}

	@Override
	protected Class<?> openClass() {
		return SchoolOpenEvent.class;
	}
	


}
