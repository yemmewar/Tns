package com.associate.hasa;


//HAS A
//person -------------------- Address
//                              ploate , state, streeno, location

//Container clAss
public class Person {
	private String name;
	private Address address;   //object reference
	
	
	
	
	
	
	//paramert
	
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	//getter 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public void displayinfo() {
		System.out.println("Name: " + name);
		System.out.println("Address: " + address.getStreet() + ", " + address.getFlatno()+ "," + address.getState()+"," + address.getPincode()+ ", " + address.getCity());
	}
	

}
