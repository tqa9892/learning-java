package com.AbstractClass.pkg1;

// when a class  call parent method   which is interface we use the word "implements" not the word "extends"  
public class InterfaceforAbstract2 implements  InterfaceForAbstract{ 

	public static void main(String[] args) {
		
		InterfaceforAbstract2 in = new InterfaceforAbstract2 ();
		in.interfaceexample1();

	}

	@Override
	public void interfaceex() {
		System.out.println("example of interface ");
		
		
	}

	@Override
	public void interfaceexample1() {
		System.out.println("example of interface and abstracts ");
		
		
	}

	@Override
	public void interfaceexample2() {
		
		
	}

}
