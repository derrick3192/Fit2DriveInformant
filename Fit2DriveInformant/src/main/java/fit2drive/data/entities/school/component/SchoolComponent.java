package fit2drive.data.entities.school.component;


import org.springframework.beans.factory.annotation.Autowired;

import util.spring.gui.component.SComponent;
import util.spring.gui.component.SIView;
import util.spring.gui.publisher.SComponentType;
import fit2drive.data.entities.school.School;
import fit2drive.data.entities.school.SchoolData;
import fit2drive.data.entities.school.dao.SchoolDao;

public class SchoolComponent extends SComponent<School, SchoolData> {

	
	@Autowired
	public SchoolComponent(SchoolDao dao) {
		super(dao, SComponentType.SCHOOL);
	}

	@Override
	protected SIView<SchoolData> createView() {
		return new SchoolDataView();
	}

}
