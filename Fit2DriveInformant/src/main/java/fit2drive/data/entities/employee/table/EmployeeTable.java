package fit2drive.data.entities.employee.table;

import javax.swing.table.AbstractTableModel;

import fit2drive.data.entities.employee.dao.EmployeeDaoImp;

public class EmployeeTable extends AbstractTableModel{

	private static final long serialVersionUID = 1L;

	EmployeeDaoImp dao;
	
	Object[][] rows;
	
	public EmployeeTable(EmployeeDaoImp dao) {
		this.dao = dao;
		//rows = dao.getRows();
	}
	
	
	@Override
	public int getColumnCount() {
		return dao.getNoColumns();
	}

	@Override
	public int getRowCount() {
		return dao.getCount();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		return rows[arg0][arg1];
	}
	
	

}
