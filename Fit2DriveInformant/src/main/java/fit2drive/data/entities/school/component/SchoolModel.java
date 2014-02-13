package fit2drive.data.entities.school.component;

import util.spring.gui.component.SIModel;
import fit2drive.data.entities.school.School;
import fit2drive.data.entities.school.SchoolData;
import fit2drive.data.entities.school.dao.SchoolDao;

public class SchoolModel implements SIModel<SchoolData> {
	
	SchoolDao dao;
	
	public SchoolModel(SchoolDao dao) {
		this.dao = dao;
	}
	
	public void saveEntity(SchoolData data) {
		School school = dao.createInstance(data);
		dao.save(school);
	}

}
