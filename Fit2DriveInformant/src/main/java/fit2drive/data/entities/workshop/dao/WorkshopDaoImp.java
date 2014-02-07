package fit2drive.data.entities.workshop.dao;

import fit2drive.data.dao.DaoImp;
import fit2drive.data.entities.workshop.Workshop;
import fit2drive.data.tables.DataColumn;


public class WorkshopDaoImp extends DaoImp<Workshop> implements WorkshopDao {

	@Override
	public Class<Workshop> getEntityClass() {
		return Workshop.class;
	}

	@Override
	protected DataColumn[] createDataColumns() {
		// TODO Auto-generated method stub
		return null;
	}


}
