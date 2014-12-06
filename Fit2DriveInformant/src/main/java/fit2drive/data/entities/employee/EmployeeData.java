package fit2drive.data.entities.employee;

import java.util.Date;




public class EmployeeData {

	String title;
	String name;
	String lastName;
	Date dob;
	boolean male;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPictureFilePath() {
		return pictureFilePath;
	}

	public void setPictureFilePath(String pictureFilePath) {
		this.pictureFilePath = pictureFilePath;
	}

	public String getHomephoneNumber() {
		return homephoneNumber;
	}

	public void setHomephoneNumber(String homephoneNumber) {
		this.homephoneNumber = homephoneNumber;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getWorkingChildrenNumber() {
		return workingChildrenNumber;
	}

	public void setWorkingChildrenNumber(String workingChildrenNumber) {
		this.workingChildrenNumber = workingChildrenNumber;
	}

	public boolean isFacilitator() {
		return facilitator;
	}

	public void setFacilitator(boolean facilitator) {
		this.facilitator = facilitator;
	}

	public boolean isLogisticsCoordinator() {
		return logisticsCoordinator;
	}

	public void setLogisticsCoordinator(boolean logisticsCoordinator) {
		this.logisticsCoordinator = logisticsCoordinator;
	}

	public boolean isEmployeeAdmin() {
		return employeeAdmin;
	}

	public void setEmployeeAdmin(boolean employeeAdmin) {
		this.employeeAdmin = employeeAdmin;
	}

	public boolean isPrincipal() {
		return principal;
	}

	public void setPrincipal(boolean principal) {
		this.principal = principal;
	}

	public boolean isOther() {
		return other;
	}

	public void setOther(boolean other) {
		this.other = other;
	}

	public String getEmailAccount() {
		return emailAccount;
	}

	public void setEmailAccount(String emailAccount) {
		this.emailAccount = emailAccount;
	}

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
