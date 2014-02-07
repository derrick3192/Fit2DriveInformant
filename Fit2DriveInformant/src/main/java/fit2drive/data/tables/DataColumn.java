package fit2drive.data.tables;

import lombok.Data;


@Data
public class DataColumn {

	Class<?> type;
	String name;
	boolean active;
	
	
	public DataColumn(Class<?> type, String name, boolean active) {
		super();
		this.type = type;
		this.name = name;
		this.active = active;
	}
	
	
	
}
