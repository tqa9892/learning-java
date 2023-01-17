package learningjava;

import learningjavaTestEx.AccessModifierB;

public class Methoddemo {

	public static void main(String[] args) {   //to execute or print code we use this line statement 
		
		Methoddemo me = new Methoddemo ();
		
	me.mylogin();
	me.mylogin();
	me.mylogin();
	me.mylogout();
		

	}
    public void mylogin () { 
    	System.out.println("log in successful");  	
	
      }
public void mylogout () {
	mylogin ();
	System.out.println("log out successful");
}
}
