package util.spring.gui.component;

import fit2drive.data.dao.Dao;

public class SModel<DATA> implements SIModel<DATA> {

	final Dao dao;
	
	@Override
	public void saveEntity(DATA data) {
		// TODO Auto-generated method stub
		
	}
	
	public SModel(Dao dao) {
		this.dao = dao;
	}

}
