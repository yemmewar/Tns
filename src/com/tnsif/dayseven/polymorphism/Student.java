package com.tnsif.dayseven.polymorphism;

public class Student {
	
	int rollNo;
	String name;
	String branch;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, String branch) {
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public void print() {
		System.out.println("NAme " + name + " RollNo " + rollNo+ " Branch "+ branch);
	}

}
