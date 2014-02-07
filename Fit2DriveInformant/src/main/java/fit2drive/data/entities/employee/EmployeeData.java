package fit2drive.data.entities.employee;

import java.util.Date;

import lombok.Data;


@Data
public class EmployeeData {

	String title;
	String name;
	String lastName;
	Date dob;
	boolean male;
	
	String streetNumber;
	String unit;
	String streetName;
	String suburb;
	String postcode;
	String state;
	String country;
	
	String pictureFilePath;
	String homephoneNumber;
	String mobilenumber;
	String workingChildrenNumber;
	boolean facilitator;
	boolean logisticsCoordinator;
	boolean employeeAdmin;
	boolean principal;
	boolean other;
	String emailAccount;
	
	public EmployeeData(
			String title,
			String name,
			String lastName,
			Date dob,
			boolean male,
			String streetNumber,
			String unit,
			String streetName,
			String suburb,
			String postcode,
			String state,
			String country,
			String pictureFilePath,
			String homephoneNumber,
			String mobilenumber,
			String workingChildrenNumber,
			boolean facilitator,
			boolean logisticsCoordinator,
			boolean employeeAdmin,
			boolean other,
			boolean principal,
			String emailAccount) {
		super();
		this.title = title;
		this.name = name;
		this.lastName = lastName;
		this.dob = dob;
		this.male = male;
		this.streetNumber = streetNumber;
		this.unit = unit;
		this.streetName = streetName;
		this.suburb = suburb;
		this.postcode = postcode;
		this.state = state;
		this.country = country;
		this.pictureFilePath = pictureFilePath;
		this.homephoneNumber = homephoneNumber;
		this.mobilenumber = mobilenumber;
		this.workingChildrenNumber = workingChildrenNumber;
		this.facilitator = facilitator;
		this.logisticsCoordinator = logisticsCoordinator;
		this.employeeAdmin = employeeAdmin;
		this.other = other;
		this.emailAccount = emailAccount;
		this.principal = principal;
	}
	
	
}
