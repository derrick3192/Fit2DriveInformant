package fit2drive.data.entities.school;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import fit2drive.data.entities.F2DEntity;
import fit2drive.data.entities.employee.Employee;
import fit2drive.data.members.address.Address;
import lombok.Data;
import lombok.EqualsAndHashCode;



@Entity
@Table(name="Schools")
@Data
@EqualsAndHashCode(callSuper=false)
public class School extends F2DEntity{
	
	public School(){}
	
	String name;
	
	Employee principal;
	
	String email;
	
	boolean privateSchool;
	
	boolean publicSchool;
	
	int phoneNumber;
	
	@Fetch(FetchMode.SELECT)	// select it straight away
	Address address;



}
