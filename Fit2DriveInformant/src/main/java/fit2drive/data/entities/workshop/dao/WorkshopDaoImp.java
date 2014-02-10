package fit2drive.data.entities.workshop.dao;

import fit2drive.data.dao.DaoImp;
import fit2drive.data.entities.workshop.Workshop;


public class WorkshopDaoImp extends DaoImp<Workshop> implements WorkshopDao {

	@Override
	public Class<Workshop> getEntityClass() {
		return Workshop.class;
	}





}
