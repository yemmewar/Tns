package com.tns.dayfive;

//child class
public class Student extends Citizen{
	
	// data members
	private int rollno;
	private String collegeName;
	private String branch;
	
	//parametrized constructor
	public Student(String name, int id, String address, String birthplace, String gender, int age, int rollno,
			String collegeName, String branch) {
		super(name, id, address, birthplace, gender, age);
		this.rollno = rollno;
		this.collegeName = collegeName;
		this.branch = branch;
	}
	
	//default constructor
	public Student(String name, int id, String address, String birthplace, String gender, int age) {
		super(name, id, address, birthplace, gender, age);
		// TODO Auto-generated constructor stub
	}
	
	//tostring
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", branch=" + branch + "]";
	}
	

	

}
