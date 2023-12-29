package com.tns.daysix;

public class Person {
	private String name;
	private String city;
	private int age;
	
	
	// getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	//default constructor
	public Person() {
		System.out.println("");
		name = "sushma";
		city = "pune";
		age = 21;
	}
	
	//0parametre constructor
	public Person(String name, String city, int age) {
	
		this.name = name;
		this.city = city;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
