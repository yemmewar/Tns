package com.tnsif.daynine.wrapperclass;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unboxing
		Integer i = new Integer(10);
		System.out.println(i);
		
		int b = i.intValue();
		System.out.println(b);
		
		
		//without usint invalue();
		int c = i;
		System.out.println(c);
		
		//Autoboxing
		int a = 100;
		Integer i1 = a;
		System.out.println(i1);

	}

}
