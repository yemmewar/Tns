package com.association;


//child class from Employee
public class Manager extends Employee {
	
	private int teamSize;

	public int getTeamSize() {
		return teamSize;
	}

	public Manager(int teamSize) {
		super();
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + "]";
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	
	
}
