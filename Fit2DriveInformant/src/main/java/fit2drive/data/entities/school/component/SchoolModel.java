package fit2drive.data.entities.school.component;

import util.spring.gui.component.SModel;
import fit2drive.data.dao.Dao;
import fit2drive.data.entities.school.School;
import fit2drive.data.entities.school.SchoolData;

public class SchoolModel extends SModel<School, SchoolData> {

	public SchoolModel(Dao<School, SchoolData> dao) {
		super(dao);
	}
	

}
