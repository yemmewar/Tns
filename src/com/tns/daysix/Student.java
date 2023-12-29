package com.tns.daysix;

public class Student extends Person{
	private int rollNo;
	private String Branch;
	private String collegeName;
	
	
	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getBranch() {
		return Branch;
	}


	public void setBranch(String branch) {
		Branch = branch;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	public Student(int rollNo, String branch, String collegeName) {
		super();
		this.rollNo = rollNo;
		Branch = branch;
		this.collegeName = collegeName;
	}
	

}
