package fit2drive.data.entities.school.dao;

import fit2drive.data.dao.DaoImp;
import fit2drive.data.entities.school.School;
import fit2drive.data.entities.school.SchoolData;
import fit2drive.data.tables.DataColumn;

public class SchoolDaoImp extends DaoImp<School> implements SchoolDao {

	@Override
	public Class<School> getEntityClass() {
		return School.class;
	}

	@Override
	protected DataColumn[] createDataColumns() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public School createInstance(SchoolData data) {
		return School.createInstance(data);
	}

}
