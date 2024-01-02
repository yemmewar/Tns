package com.associate.hasa;


//containent
public class Address {
	private String street;
	private String city;
	private int flatno;
	private String state;
	private int pincode;
	
	
	
	public Address(String street, String city, int flatno, String state, int pincode) {
		super();
		this.street = street;
		this.city = city;
		this.flatno = flatno;
		this.state = state;
		this.pincode = pincode;
	}


//
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public int getFlatno() {
		return flatno;
	}



	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public int getPincode() {
		return pincode;
	}



	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", flatno=" + flatno + ", state=" + state + ", pincode="
				+ pincode + "]";
	}



	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
	
	
	

}
