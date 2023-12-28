package com.tns.dayfour.privateconstructor;

public class MyClassDriver {
	
	public static void main(String[] args) {
		//MyClass ml = new MyClass();
		
		MyClass obj =  MyClass.getobject();
		MyClass obj1 =  MyClass.getobject();
		System.out.println(obj == obj1);
		System.out.println(obj);
		System.out.println(obj1);
	}

}
