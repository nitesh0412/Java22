package com.aurionpro.model;

public class checked_Exception_handling {
	
	public static void main(String[] args) {
		System.out.println("main start");
		function1();
		System.out.println("main ends");
	}

	private static void function1() {
		System.out.println("f1 start");
		try {
			function2();
		} catch (Exception e) {
			System.out.println("Exception Handeled in function 2");

		}
		System.out.println("f1 ends");	}

	private static void function2() throws Exception {
		System.out.println("f2 start");
		function3();
		System.out.println("f2 ends");		
	}

	private static void function3() throws Exception {
		System.out.println("f3 start");
		function4();
		System.out.println("f3 End");

	}

	private static void function4() throws Exception {
		System.out.println("f4 start");
		throw new RuntimeException();
	}
}
