package com.tns.daysix;

public class HiraDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
		System.out.println("person.........");
		System.out.println(p);
		
		
		
		
		Person p1;
		p1 = new Person("rahul", "pune", 24);
		System.out.println(p1);
		
//		p1 = new Student("muskan","nagpur", 22, 102," IT", "GHRCEM");
//		System.out.println(p1);
		
		p1 = new Employe("Aakash", "Delhi", 23, 1234, "info", "Developer", 5000);
		System.out.println(p1);

	}
	

}
