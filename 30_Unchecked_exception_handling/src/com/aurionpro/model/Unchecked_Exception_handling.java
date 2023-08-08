package com.aurionpro.model;

public class Unchecked_Exception_handling {
	
	public static void main(String[] args) {
		System.out.println("main start");
		function1();
		System.out.println("main ends");
	}

	private static void function1() {
		System.out.println("f1 start");
		function2();
		System.out.println("f1 ends");	}

	private static void function2() {
		System.out.println("f2 start");
		function3();
		System.out.println("f2 ends");		
	}

	private static void function3() {
		System.out.println("f3 start");
		try {
			function4();
			}
			catch(RuntimeException e)
			{
		System.out.println("f3 End");
			}
	}

	private static void function4() {
		System.out.println("f4 start");
		throw new RuntimeException();
	}
}
