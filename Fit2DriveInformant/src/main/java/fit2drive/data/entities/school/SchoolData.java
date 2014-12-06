package fit2drive.data.entities.school;

import fit2drive.data.members.address.AddressData;


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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isPub() {
		return pub;
	}

	public void setPub(boolean pub) {
		this.pub = pub;
	}

	public boolean isPriv() {
		return priv;
	}

	public void setPriv(boolean priv) {
		this.priv = priv;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public AddressData getAddress() {
		return address;
	}

	public void setAddress(AddressData address) {
		this.address = address;
	}

	
	
}
