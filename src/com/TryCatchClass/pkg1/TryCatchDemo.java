package com.TryCatchClass.pkg1;

public class TryCatchDemo {

	public static void main(String[] args) { // exception handling method which is try and catch method

		try {
			int i = 4;
			System.out.println("before error occure"); // before using try catch execution stopped when error or
														// exception occure
			System.out.println(i / 0);
		} catch (Throwable t) // we need this "catch (Throwable t) {} "statement for try catch method
		{
			System.out.println(t.getMessage()); // this print get message provide what are the error occure
			System.out.println(t.getCause()); // gives the reason of error
			System.out.println(t.fillInStackTrace()); // gives the logic for the error from java

		}

		finally {
			System.out.println("finally statement alwas execute after exceptio"); // when finally statement use it's
																					// always continue execute in it's
																					// code . even if there's no error
																					// occur it's still execute
		}
		System.out.println("after error occure");

	}

}
