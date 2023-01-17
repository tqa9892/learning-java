package com.AbstractClass.pkg1;

public class ExecutingAbstractMethod extends AbstractClassMethodBrowser { 
//another method is abstract method which is you have to change the child class as abstract like parent class
// public abstract class ExecutingAbstractMethod extends AbstractClassMethodBrowser [is called abstract method]	
	
	public static void main(String[] args) {
		ExecutingAbstractMethod am = new ExecutingAbstractMethod ();
		am.Browser();
		am.execute();
		am.click();

	}

	@Override            // this type of abstract method is called concrete method
	public void Browser() {
		System.out.println("using edge browser"); //also an example of overriding polymorphysom
		
	}

	@Override
	public void click() {
		System.out.println("double click");
		
	}

	@Override
	public void execute() {
		System.out.println("executing automation");
		
	}

}
