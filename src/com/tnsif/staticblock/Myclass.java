package com.tnsif.staticblock;

public class Myclass {
	private int section; //non-static
	private static int srno; //static
	
	
	//static block
	static {
		System.out.println("In static block");
		srno =100;
//		section =1254; // can not use non-static member
	}


	
//	default constructor
	public Myclass( ) {
		System.out.println("default constructor");
		srno++;
		section++;
	}



	@Override
	public String toString() {
		return "Myclass [section=" + section + ", srno" + srno +"]";
	}
	
	static void display() {
		System.out.println(srno);
	}
	
	public void print() {
		System.out.println(srno);
		System.out.println(section);
	}
	

}
