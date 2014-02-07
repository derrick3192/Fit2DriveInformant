package fit2drive.data.entities.school;

import fit2drive.data.members.address.AddressData;
import lombok.Data;

@Data
public class SchoolData {
	
	String name;
	
	String email;
	
	String phone;
	
	boolean pub;
	
	boolean priv;
	
	String religion;
	
	AddressData address;

	public SchoolData(String name, String email, String phone, boolean pub,
			boolean priv, String religion, AddressData address) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.pub = pub;
		this.priv = priv;
		this.religion = religion;
		this.address = address;
	}

}
