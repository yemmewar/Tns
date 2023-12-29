package com.tns.daysix;

public class Employe  extends Person{
	private int Empid;
	private String comname;
	private String destination;
	private float salary;
	
	
	
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getComname() {
		return comname;
	}
	public void setComname(String comname) {
		this.comname = comname;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [Empid=" + Empid + ", comname=" + comname + ", destination=" + destination + ", salary="
				+ salary + ", getName()=" + getName() + ", getCity()=" + getCity() + ", toString()=" + super.toString()
				+ ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	public Employe() {
		super();
		System.out.println("employee constructor");
	}
	public Employe(String name, String city, int age, int empid, String comname, String destination, float salary) {
		super(name, city, age);
		Empid = empid;
		this.comname = comname;
		this.destination = destination;
		this.salary = salary;
	}

}
