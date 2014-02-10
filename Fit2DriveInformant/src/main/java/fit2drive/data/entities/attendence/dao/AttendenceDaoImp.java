package fit2drive.data.entities.attendence.dao;

import fit2drive.data.dao.DaoImp;
import fit2drive.data.entities.attendence.Attendence;

public class AttendenceDaoImp extends DaoImp<Attendence> implements AttendenceDao {

	@Override
	public Class<Attendence> getEntityClass() {
		return Attendence.class;
	}

}
