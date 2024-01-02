package com.associate.hasa;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address = new Address("wagholi", "pune", 452, "maharstra", 4568);
		Person p = new Person("sushma" , address);
		p.displayinfo();

	}

}
