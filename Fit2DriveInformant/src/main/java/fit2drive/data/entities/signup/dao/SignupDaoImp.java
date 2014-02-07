package fit2drive.data.entities.signup.dao;

import fit2drive.data.dao.DaoImp;
import fit2drive.data.entities.signup.Signup;
import fit2drive.data.tables.DataColumn;

public class SignupDaoImp extends DaoImp<Signup> implements SignupDao {

	@Override
	public Class<Signup> getEntityClass() {
		return Signup.class;
	}

	@Override
	protected DataColumn[] createDataColumns() {
		// TODO Auto-generated method stub
		return null;
	}

}
