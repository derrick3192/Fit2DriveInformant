package fit2drive.data.entities.attendence.dao;

import fit2drive.data.dao.DaoImp;
import fit2drive.data.entities.attendence.Attendence;
import fit2drive.data.tables.DataColumn;

public class AttendenceDaoImp extends DaoImp<Attendence> implements AttendenceDao {

	@Override
	public Class<Attendence> getEntityClass() {
		return Attendence.class;
	}

	@Override
	protected DataColumn[] createDataColumns() {
		// TODO Auto-generated method stub
		return null;
	}

}
