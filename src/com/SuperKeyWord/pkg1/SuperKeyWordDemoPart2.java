package com.SuperKeyWord.pkg1;

public class SuperKeyWordDemoPart2 extends SuperKeyWordDemo {

	
	/*   public SuperKeyWordDemoPart2 ()
	 { super(3,"constructor12"); 
	 }  */                      
	                                         
	//this commented out is the example of using SUPER keyword in Constructor }
	 

	int id = 6;
	String name = "Ripon";

	public static void main(String[] args) {

		SuperKeyWordDemoPart2 skd = new SuperKeyWordDemoPart2();
		skd.getdata();        // here we are calling present (child method) data which is overriding the
						     // parent method

		                  // when i called get data method it will override the parent method and provide
		                 // child method new data

	}

	public void getdata() {
		super.getdata();
		System.out.println(id); // this is printing new data
		System.out.println(name);
		System.out.println(super.name);// when SUPER keyword is used , it called the previous or old data from parent
										// class
	}

}
