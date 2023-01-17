package learningjavaTestEx;

import learningjava.AddParameterDemo;

public class CallingMethodFromAnotherPackage {
	
	

	public static void main(String[] args) {   // shortcut write "main than press ctrl+space 
		
		AddParameterDemo ap = new AddParameterDemo() ;// made object from another package to call method
		ap.addparameter(0, 0);
		ap.diffparameter(null, 0, 0);// we can call any method from other class or package by creating object.
		AccessModifierA ama = new AccessModifierA ();
		ama.accessAA();

	}
	
		
	}


