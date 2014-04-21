package fit2drive.data.entities.school.dao;

import fit2drive.data.dao.DaoImp;
import fit2drive.data.entities.school.School;
import fit2drive.data.entities.school.SchoolData;

public class SchoolDaoImp extends DaoImp<School, SchoolData> implements SchoolDao {

	@Override
	public Class<School> getEntityClass() {
		return School.class;
	}


	@Override
	public School createEntity(SchoolData data) {
		return School.createInstance(data);
	}


	@Override
	public School createValidEntity() {
		// TODO Auto-generated method stub
		return null;
	}

}
