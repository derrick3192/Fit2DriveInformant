package fit2drive.data.entities.employee;


import java.io.File;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Data;
import lombok.EqualsAndHashCode;
import fit2drive.data.entities.F2DEntity;
import fit2drive.data.members.address.Address;
import fit2drive.data.members.datafile.DataFile;

/**
 * @author Derrick
 *
 *	Class to encapsulate an employee
 */
@Entity
@EqualsAndHashCode(callSuper=false)
@Data
public class Employee extends F2DEntity {
	
	public Employee(){};
	
	String title;
	
	/**First name of the <code>Employee </code> **/
	String firstName;
	
	/** Last name of the <code>Employee </code> **/
	String lastName;
	
	/** Date of Birth **/
	Date dob;
	
	/** living address **/
	@Fetch(FetchMode.SELECT)	// select it straight away
	Address livingAddress;
	
	/** working with children picture **/
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn
	public DataFile picture;
	
	
	/** Is the employee male? **/
	boolean male=false;
	
	/** Home number **/
	int homephoneNumber=0;
	
	/** Mobile number **/
	int mobilenumber=0;
	
	/** Working with children number **/
	String workingChildrenNumber="";
	
	/** Is the employee a facilitator? **/
	boolean facilitator=true;
	
	/** Is the employee a logistics coordinator? **/
	boolean logisticsCoordinator=false;
	
	/** Is the employee a presenter **/
	boolean employeeAdmin=false;
	
	/** Is the employee active **/
	boolean employeeActive=true;
	
	/** Is the employee a school principal **/
	boolean principal=false;
	
	/** Is some other type of employee **/
	boolean other=false;
	
	/** Email account of the employee **/
	String emailAccount="";
	
	
	
	
	
	
	public Employee(
			String name,
			Date dob,
			Address livingAddress) {
		this.firstName = name;
		this.dob = dob;
		this.livingAddress = livingAddress;
	}






	public Employee(String title, String firstName, String lastName, Date dob, Address livingAddress,
			DataFile picture, boolean male, int homephoneNumber,
			int mobilenumber, String workingChildrenNumber,
			boolean facilitator, boolean logisticsCoordinator,
			boolean employeeAdmin, boolean principal, boolean other, boolean employeeActive, String emailAccount) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.livingAddress = livingAddress;
		this.picture = picture;
		this.male = male;
		this.homephoneNumber = homephoneNumber;
		this.mobilenumber = mobilenumber;
		this.workingChildrenNumber = workingChildrenNumber;
		this.facilitator = facilitator;
		this.logisticsCoordinator = logisticsCoordinator;
		this.employeeAdmin = employeeAdmin;
		this.employeeActive = employeeActive;
		this.principal = principal;
		this.other = other;
		this.emailAccount = emailAccount;
	}
	
	
	public static Employee createInstance(EmployeeData data) {
		
		Address address = new Address(
				Integer.parseInt(data.getStreetNumber()),
				data.getUnit(),
				data.getStreetName(),
				data.getSuburb(),
				Integer.parseInt(data.getPostcode()),
				data.getState(),
				data.getCountry());
		
		String picturePath  = data.getPictureFilePath();
		String[] splitPath  = picturePath.split(".");
		String name 		= splitPath[0];
		String extension 	= splitPath[1];
		File file = new File(picturePath);
		
		DataFile pic = new DataFile(name, extension, file);
		
		return new Employee(
				data.getTitle(),
				data.getName(),
				data.getLastName(),
				data.getDob(),
				address,
				pic,
				data.isMale(),
				Integer.parseInt(data.getHomephoneNumber()),
				Integer.parseInt(data.getMobilenumber()),
				data.getWorkingChildrenNumber(),
				data.isFacilitator(),
				data.isLogisticsCoordinator(),
				data.isEmployeeAdmin(),
				data.isPrincipal(),
				data.isOther(),
				true,
				data.getEmailAccount());
	}






	@Override
	public String[] headings() {
		return new String[]{"ID", "NAME"};
	}




	@Override
	public Object[] asRow() {
		return new Object[]{this.id, this.firstName};
	}


//	@Override
//	public Object[] getTableRow() {
//
//		return new Object[]{
//		this.title,
//		this.firstName,
//		this.lastName,
//		this.dob,
//		this.livingAddress.getNumber(),
//		this.livingAddress.getUnit(),
//		this.livingAddress.getStreet(),
//		this.livingAddress.getSuburb(),
//		this.livingAddress.getPostcode(),
//		this.livingAddress.getState(),
//		this.livingAddress.getCountry(),
//		//ImageUtils.createImageFromBytes(this.picture.getFileAsBytes()).getScaledInstance(50, 50, Image.SCALE_DEFAULT),
//		this.male,
//		this.homephoneNumber,
//		this.mobilenumber,
//		this.workingChildrenNumber,
//		this.facilitator,
//		this.logisticsCoordinator,
//		this.employeeAdmin,
//		this.employeeActive,
//		this.principal,
//		this.other,
//		this.emailAccount
//		};
//		
//	}


}
