package util.spring.gui.component;

import fit2drive.data.dao.Dao;
import fit2drive.data.entities.F2DEntity;

public class SModel<ENITY extends F2DEntity, DATA> implements SIModel<DATA> {

	final Dao<ENITY, DATA> dao;
	
	@Override
	public void saveEntity(DATA data) {
		//ENITY entity = dao.createEntity(data);
		//dao.save(entity);
		System.out.println("Create New Entity");
	}
	
	public SModel(Dao<ENITY, DATA> dao) {
		this.dao = dao;
	}

}
