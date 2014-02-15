package util.spring.gui.component;

import fit2drive.data.dao.Dao;
import fit2drive.data.entities.F2DEntity;

import static util.spring.gui.component.SaveResult.*;

public class SModel<ENITY extends F2DEntity, DATA> implements SIModel<DATA> {

	final Dao<ENITY, DATA> dao;
	
	public SModel(Dao<ENITY, DATA> dao) {
		this.dao = dao;
	}
	
	@Override
	public boolean saveEntity(DATA data) throws ModelSavingException {
		
		ENITY entity =null;
		
		try {
			entity = dao.createEntity(data);
		} catch (Exception e) {
			throw new ModelSavingException("Instantiation Error + Error message: \n\n ---" +e.getMessage(), EXCEPTIONCREATING);
		}
		
		try {
		dao.save(entity);
		} catch (Exception e) {
			throw new ModelSavingException("Saving Error + Error message: \n\n ---" +e.getMessage(), EXCEPTIONSAVING);
		}
		
		return true;
	}

}
