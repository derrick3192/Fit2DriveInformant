package util.spring.gui.component;

import javax.swing.JOptionPane;

import fit2drive.data.dao.Dao;
import fit2drive.data.entities.F2DEntity;

public class SModel<ENITY extends F2DEntity, DATA> implements SIModel<DATA> {

	final Dao<ENITY, DATA> dao;
	
	@Override
	public boolean saveEntity(DATA data) {
		
		ENITY entity =null;
		
		try {
			entity = dao.createEntity(data);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
				    "Could not create entity.",
				    "Instantiation Error + Error message: \n\n" +e.getMessage(),
				    JOptionPane.ERROR_MESSAGE);
			return false;
		}
		
		try {
		dao.save(entity);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
				    "Could not create entity.",
				    "Instantiation Error + Error message: \n\n" +e.getMessage(),
				    JOptionPane.ERROR_MESSAGE);
			return false;
		}
		
		return true;
	}
	
	public SModel(Dao<ENITY, DATA> dao) {
		this.dao = dao;
	}

}
