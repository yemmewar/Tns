package com.tns.dayfive;


//parent class
public class Citizen {
	private String name;
	private int id;
	private String address;
	private String birthplace;
	private String gender;
	
	
	public Citizen(String name, int id, String address, String birthplace, String gender, int age) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.birthplace = birthplace;
		this.gender = gender;
		this.age = age;
	}
	private int age;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthplace() {
		return birthplace;
	}
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//paramiterized constctor
	

}
