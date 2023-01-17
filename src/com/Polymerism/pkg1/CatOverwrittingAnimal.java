package com.Polymerism.pkg1;

public class CatOverwrittingAnimal extends OverwrittingAnimal { //it's also example of inheritance where parents class is OverwrittingAnimal 

	public static void main(String[] args) {

		CatOverwrittingAnimal ca = new CatOverwrittingAnimal();
		ca.animalsound();

	}

	public void animalsound() { // here i used the same signature animalsound (animalsound method is from OverwrittingAnimal
	                          // class) from the parents class and overriding  the output and get new output
	          
		System.out.println("cat say meeaw"); //changed the output even method was from parent class
	}    
	     //this is why it's called late binding/dynamic binding/Method overriding  or runtime polymorphism

}
