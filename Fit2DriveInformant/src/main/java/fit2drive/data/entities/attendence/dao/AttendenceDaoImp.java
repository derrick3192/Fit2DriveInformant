package fit2drive.data.entities.attendence.dao;

import fit2drive.data.dao.DaoImp;
import fit2drive.data.entities.attendence.Attendence;
import fit2drive.data.entities.attendence.AttendenceData;

public class AttendenceDaoImp extends DaoImp<Attendence, AttendenceData> implements AttendenceDao {

	@Override
	public Class<Attendence> getEntityClass() {
		return Attendence.class;
	}

	@Override
	public Attendence createEntity(AttendenceData data) {
		return null;
	}

	@Override
	public Attendence createValidEntity() {
		// TODO Auto-generated method stub
		return null;
	}

}
