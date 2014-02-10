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
	

}
