package com.tns.dayfour.privateconstructor;

public class MyClass {
	
	//MyClass obj1 = new MyClass(); // early initialization
	
	private MyClass() {
		System.out.println("MyClass object is created");
	}
	
	
	
	private static MyClass obj = null;
	
	
	public static MyClass getobject() {
		if(obj ==null) {
			obj = new MyClass();   //lazy instantiation
		}
		return obj;
	}

}
