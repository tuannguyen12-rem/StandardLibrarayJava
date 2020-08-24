package com.shoppingCart.Customer;

public class Custom {

	private String firstName;
	private String lastName;
	private int postcode;
	private String place;
	private String stress;
	private int houseNumber;

	public Custom(String firstName, String lastName, int postcode, String place, String stress, int houseNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.postcode = postcode;
		this.place = place;
		this.stress = stress;
		this.houseNumber = houseNumber;
	}

	public Custom() {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getStress() {
		return stress;
	}

	public void setStress(String stress) {
		this.stress = stress;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String toString() {
		return this.firstName+ " " + this.lastName+ " " + this.postcode+ " " + this.place+ " " + this.stress+ " " + this.houseNumber;
	}

}
