package learningjavaTestEx;

import learningjava.AddParameterDemo;
import learningjava.Operators;

public class AccessModifierB {
	private static final Operators New = null;
// we create object of the class 

	public int publicint = 1;
	int defultvariable = 2;
	private int privatevariable = 3;
	protected int protectedvariable = 4;

	public static void main(String[] args) { // psvm can create object of the class to call belows method
		
		AccessModifierB ab = new AccessModifierB(); // or it can be called from other package or class

		ab.privatevariable = 3; // we can call this method coz privatevariable is from same
								// class(AccessModifierB).

		AddParameterDemo ap = new AddParameterDemo(); //AddParameterDemo this method is added from diff package and class

	}

	public void publicmethodvoid() {

		System.out.println("print void public method ");
	}

	void defaultmethod() {
		System.out.println("print default method");
	}

	private void privatevoidmethod() {
		System.out.println("Print privatevoid method");
	}

	protected void protectedvoidmethod() {
		System.out.println("print protectedvoid");
	}

}
