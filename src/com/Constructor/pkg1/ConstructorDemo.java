package com.Constructor.pkg1;

public class ConstructorDemo { // constructor is also an example of Overloading (polymorphysm) 
	
	public ConstructorDemo () {
		   
		System.out.println("no value pass");   // no return by constructor.. same name as class
	}

	public ConstructorDemo ( int i , int j) { 
		   
		System.out.println("int value pass");   
	}
	
	public ConstructorDemo (int i, String s) {
		   
		System.out.println("int and string  value pass");   // no return by constructor.. same name as class
	}
	public static void main(String[] args) {
		
		ConstructorDemo cd = new ConstructorDemo (5,4);

	}

}
