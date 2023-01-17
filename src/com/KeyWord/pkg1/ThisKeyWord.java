package com.KeyWord.pkg1;

public class ThisKeyWord {
	int i = 7;
	int y = 9;
	

	public static void main(String[] args) {
		ThisKeyWord tk = new ThisKeyWord ();
		tk.getthedata();
		tk.getthedata1();

	}
	public void getthedata () {
		int i= 11;
		int y= 12;
		System.out.println(i+y);   // here i and y local instance variable execute their local value which are 11&12          
		System.out.println(this.i+this.y); // "this" key word is use to  retrieve the old data from the same  
		                                   // class even instance variable is same . by using this key word i and y execute the value 7&9
	}
	public void getthedata1 () {
		int i =this.i; 
		System.out.println(i);
		
	}
	
}
