package fit2drive.data.members.address;

import javax.persistence.Embeddable;

import fit2drive.data.members.Fit2DriveMember;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@Embeddable
@EqualsAndHashCode(callSuper=false)
public class Address extends Fit2DriveMember{
	
	/** **/
	private static final String defaultCountry = "Australia";
	private static final String defaultState = "Victoria";
	
	int 	number;
	String 	unit;
	String 	street;
	String 	suburb;
	int		postcode;
	String 	state = defaultState;
	String 	country = defaultCountry;
	

	
	public static Address createInstance(AddressData data) {
		Address address = new Address(
				Integer.parseInt(data.getStreetNumber()),
				data.getUnit(),
				data.getStreetName(),
				data.getSuburb(),
				Integer.parseInt(data.getPostcode()),
				data.getState(),
				data.getCountry());
		
		return address;
	}
	
	
	
	public Address(){super();}
	
	
	
	
	
	
	
	public Address(String street, String suburb, int postcode, String state) {
		super();
		this.street = street;
		this.suburb = suburb;
		this.postcode = postcode;
		this.state = state;
		this.country = defaultCountry;
	}
	
	public Address(String street, String suburb, int postcode) {
		super();
		this.street = street;
		this.suburb = suburb;
		this.postcode = postcode;
		this.state = defaultState;
		this.country = defaultCountry;
	}


//	public void setNumber(String number) {
//		this.firePropertyChange("number", number, this.number = number);
//	}
//
//	public void setUnit(String unit) {
//		this.firePropertyChange("unit", unit, this.unit = unit);
//	}
//
//	public void setStreet(String street) {
//		this.firePropertyChange("street", street, this.street = street);
//	}
//
//	public void setSuburb(String suburb) {
//		this.firePropertyChange("suburb", suburb, this.suburb = suburb);
//	}
//
//	public void setPostcode(int postcode) {
//		this.firePropertyChange("postcode", postcode, this.postcode = postcode);
//	}
//
//	public void setState(String state) {
//		this.firePropertyChange("state", state, this.state = state);
//	}
//
//	public void setCountry(String country) {
//		this.firePropertyChange("country", country, this.country = country);
//	}







	public Address(
			int number,
			String unit,
			String street,
			String suburb,
			int postcode,
			String state,
			String country
			) {
		super();
		this.number = number;
		this.unit = unit;
		this.street = street;
		this.suburb = suburb;
		this.postcode = postcode;
		this.state = state;
		this.country = country;
	}



	@Override
	public Object[] getTableRow() {
		// TODO Auto-generated method stub
		return null;
	}



//	@Override
//	public DataColumn[] getColumns() {
//		
//		DataColumn streetNumber = new DataColumn(Integer.class, "Street no.", false);
//		DataColumn streetUnit = new DataColumn(String.class, "Unit", false);
//		DataColumn streetName = new DataColumn(String.class, "Name", true);
//		DataColumn suburb = new DataColumn(String.class, "Suburb", true);
//		DataColumn postcode = new DataColumn(Integer.class, "Postcode", false);
//		DataColumn state = new DataColumn(String.class, "State", false);
//		DataColumn country = new DataColumn(String.class, "Country", false);
//		
//		return new DataColumn[]{
//				streetNumber,
//				streetUnit,
//				streetName,
//				suburb,
//				postcode,
//				state,
//				country
//				};
//	}

	
}
