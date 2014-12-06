package fit2drive.data.members.address;



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
	
	

}
