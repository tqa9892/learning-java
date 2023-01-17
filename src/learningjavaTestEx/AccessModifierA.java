package learningjavaTestEx;

import learningjava.AddParameterDemo;

public class AccessModifierA {
	

  public static void main (String  [] args) {
	
	 
	  AccessModifierB acb =new AccessModifierB ();
	  acb.protectedvoidmethod();
	  acb.publicint =0 ;
	  // i can have access to public, protected and default but not access to private method
	  // from AccessModifierB class . even though it was from the same package . private is only access able to
	  // for the same class ()
	  // for diff package only public is accessable
	  //( **NO private ,protected , default are accessable for diff package)
  }
  public void accessAA () {
	  System.out.println("present program access Aa printing");
		  
	  }
  
}
