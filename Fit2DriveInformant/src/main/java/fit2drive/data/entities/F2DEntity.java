package fit2drive.data.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Derrick
 * 
 * All entities will need an ID and will extend this class
 *
 */
@MappedSuperclass
public abstract class F2DEntity {
	
	
	@Id @GeneratedValue
	@Column(name="ID")
	protected int id;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
//	public int getNoColumnsActive() {
//		DataColumn[]columns = this.getColumns();
//		int active = 0;
//		for (DataColumn colomn : columns) {
//			if (colomn.isShowing()) {
//				active++;
//			}
//		}
//		return active;
//	}
//	
//	public abstract Object[] getRow();
	
//	public Object[] getRowForTable() {
//		int noLocalColumns = this.getNoColumnsActive();
//		Object[] localRow = new Object[noLocalColumns];
//		
//		Object[] globalRow = this.getRow();
//		DataColumn[] dataColumns = this.getColumns();
//		
//		int localIndex = 0;
//		for (int globalIndex=0; globalIndex<dataColumns.length; globalIndex++) {
//			if (dataColumns[globalIndex].isShowing()) {
//				localRow[localIndex] = globalRow[globalIndex];
//				localIndex++;
//			}
//		}
//		
//		return localRow;
//	}
	

}
