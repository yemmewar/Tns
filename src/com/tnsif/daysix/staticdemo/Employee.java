package com.tnsif.daysix.staticdemo;

public class Employee {
	
	//declare variable
	private String name;
	private int id;
	
	
	
	//declate static variable
	static String companyName = "TNS";



	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", companrName" + companyName + "]";
	}
	
	
	
	
	

}
