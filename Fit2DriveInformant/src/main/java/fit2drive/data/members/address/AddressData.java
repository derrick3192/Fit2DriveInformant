package fit2drive.data.members.address;

import lombok.Data;


@Data
public class AddressData {
	
	String 	streetNumber;
	String 	unit;
	String 	streetName;
	String 	suburb;
	String	postcode;
	String 	state;
	String 	country;
	
	
	
	public AddressData(String streetNumber, String unit, String streetName,
			String suburb, String postcode, String state, String country) {
		super();
		this.streetNumber = streetNumber;
		this.unit = unit;
		this.streetName = streetName;
		this.suburb = suburb;
		this.postcode = postcode;
		this.state = state;
		this.country = country;
	}
	
	

}
