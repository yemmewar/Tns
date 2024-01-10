package com.tnsif.dayseven.polymorphism;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI rbi;
		
		rbi= new RBI();
		System.out.println(rbi.getRateofInterest());
		
		rbi= new Axis();
		System.out.println(rbi.getRateofInterest());
		
		rbi= new ICICI();
		System.out.println(rbi.getRateofInterest());

	}

}
