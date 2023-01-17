package com.FinalKeyWord.pkg1;

public class FinalKeywordChild extends FinalKeywordParent {
	
	int i= 9;

	public static void main(String[] args) {
	 
		FinalKeywordChild fc = new FinalKeywordChild ();
		fc.parentdata();

	}
//	 public void parentdata () {    // error because parents method use keyword ""final" so we can't override it
//		System.out.println(i);
//	}
}


