package fit2drive.data.entities.school.component;


import org.springframework.beans.factory.annotation.Autowired;

import util.spring.gui.component.SComponent;
import util.spring.gui.component.SIView;
import fit2drive.data.dao.Dao;
import fit2drive.data.entities.school.School;
import fit2drive.data.entities.school.SchoolData;
import fit2drive.data.entities.school.dao.SchoolDao;

public class SchoolComponent extends SComponent<School, SchoolData> {

	
	@Autowired
	public SchoolComponent(SchoolDao dao) {
		this(SchoolOpenEvent.class, SchoolCloseEvent.class, dao);
	}
	
	
	public SchoolComponent(Class<SchoolOpenEvent> open, Class<SchoolCloseEvent> close, Dao<School, SchoolData> dao) {
		super(open, close, dao);
	}


	@Override
	protected SIView<SchoolData> createView() {
		return new SchoolDataView();
	}

	

}
