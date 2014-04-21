package fit2drive.data.dao;

import javax.swing.table.AbstractTableModel;

public class EntityTableModel extends AbstractTableModel {
	
	Dao<?,?> dao;
	
	Object[][] data;
	
	public EntityTableModel(Dao<?,?> dao) {
		this.dao = dao;
		this.data = dao.getData();
	}

	@Override
	public int getColumnCount() {
		return this.dao.numberOfColumns();
	}

	@Override
	public int getRowCount() {
		return this.dao.getCount();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		return data[arg0][arg1];
	}

}
