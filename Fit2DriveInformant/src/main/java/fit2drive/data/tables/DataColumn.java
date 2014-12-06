package fit2drive.data.tables;




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


	public Class<?> getType() {
		return type;
	}


	public void setType(Class<?> type) {
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
}
