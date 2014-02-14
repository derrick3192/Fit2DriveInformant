package fit2drive.data.entities.school.component;

import org.springframework.beans.factory.annotation.Autowired;

import util.spring.gui.component.SBaseComponent;
import util.spring.gui.component.SBaseController;
import fit2drive.data.entities.school.dao.SchoolDao;

public class SchoolComponent extends SBaseComponent {
	
	@Autowired
	SchoolDao dao;
	
	@Override
	protected SBaseController createController() {
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
