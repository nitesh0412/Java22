package com.aurionpro.test;

public class passbyvalue {
	public static void main(String[] args) {
		int num = 10;
//		incrementbyone(num);
//		num = incrementbyone(num);
//		System.out.println(num);
		System.out.println(incrementbyone(num));
	}
	public static int incrementbyone(int x) {
		 x++ ;
		return x;
	}
}
