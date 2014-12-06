package fit2drive.data.entities.school;

import javax.persistence.Entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import fit2drive.data.entities.F2DEntity;
import fit2drive.data.entities.employee.Employee;
import fit2drive.data.members.address.Address;



@Entity
public class School extends F2DEntity{
	
	public School(){}
	
	
	
	String name;
	
	Employee principal;
	
	String email;
	
	boolean privateSchool;
	
	boolean publicSchool;
	
	int phoneNumber;
	
	String religeon;
	
	@Fetch(FetchMode.SELECT)	// select it straight away
	Address address;
	
	
	public static School createInstance(SchoolData data) {
		
		String name = data.getName();
		Employee principal = null;
		String email = data.getEmail();
		boolean privateSchool = data.isPriv();
		boolean publicSchool = data.isPub();
		int phoneNumber = Integer.parseInt(data.getPhone());
		String religeon = data.getReligion();
		
		if (name == null) {
			throw new IllegalArgumentException("name is null");
		}
		
		return new School(
				name,
				principal,
				email,
				privateSchool,
				publicSchool,
				phoneNumber,
				religeon,
				Address.createInstance(data.getAddress()));
		
	}


	public School(
			String name,
			Employee principal,
			String email,
			boolean privateSchool,
			boolean publicSchool,
			int phoneNumber,
			String religeon,
			Address address) {
		super();
		this.name = name;
		this.principal = principal;
		this.email = email;
		this.privateSchool = privateSchool;
		this.publicSchool = publicSchool;
		this.phoneNumber = phoneNumber;		
		this.religeon = religeon;
		
	}


	@Override
	public String[] headings() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object[] asRow() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Employee getPrincipal() {
		return principal;
	}


	public void setPrincipal(Employee principal) {
		this.principal = principal;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isPrivateSchool() {
		return privateSchool;
	}


	public void setPrivateSchool(boolean privateSchool) {
		this.privateSchool = privateSchool;
	}


	public boolean isPublicSchool() {
		return publicSchool;
	}


	public void setPublicSchool(boolean publicSchool) {
		this.publicSchool = publicSchool;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getReligeon() {
		return religeon;
	}


	public void setReligeon(String religeon) {
		this.religeon = religeon;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}



}
