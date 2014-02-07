package fit2drive.data.entities.school.dao;

import fit2drive.data.dao.Dao;
import fit2drive.data.entities.school.School;
import fit2drive.data.entities.school.SchoolData;

public interface SchoolDao extends Dao<School>{

	/** Create na instance of a school */
	School createInstance(SchoolData data);

}
