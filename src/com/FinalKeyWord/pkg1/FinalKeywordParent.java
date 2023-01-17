package com.FinalKeyWord.pkg1;

public class FinalKeywordParent { //if we use public final class here we can't inherited this class
	
	public final int  i = 7; // can't change variable if we use final
	 
	public final void parentdata () {  //can't override the method later  if we use final keyword
		System.out.println(i);
	}

}
