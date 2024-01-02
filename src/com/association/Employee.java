package com.association;

public class Employee {
	private String name;
	private String Department;
	private int Mob ;
	private int Empid ;
	
	
	
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String department, int mob, int empid) {
		super();
		this.name = name;
		Department = department;
		Mob = mob;
		Empid = empid;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", Department=" + Department + ", Mob=" + Mob + ", Empid=" + Empid + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getMob() {
		return Mob;
	}
	public void setMob(int mob) {
		Mob = mob;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	

}
