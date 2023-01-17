package com.Polymerism.pkg1;

public class MethodOverloading { // when you have same function but calling it with different data type or method
									// is called method overloading or early binding or static binding compile time
									// polymerism. example was calling login method same name but diff signature or
									// diff data type.here method name has to be same

	public static void main(String[] args) {

		MethodOverloading mo = new MethodOverloading();
		mo.login(46656565, "pass");
		mo.login(null, null, 0);

	}

	public void login(String s, String p) {

		System.out.println("login with username and password");
	}

	public void login(int i, String p) {

		System.out.println("login with phone number and password");
	}

	public void login(String s, String p, int x) {

		System.out.println("login with username/pin and password");
	}
}
