package com.aurionpro.model;

public class threadTest {
	
	public static void main(String[] args) {
		printNum t1 = new printNum();
				System.out.println("T1");
				t1.start();
		printNum t2 = new printNum();
				t2.start();
				System.out.println("T2");
		t2.setPriority(5);
//		System.out.println(t1.getPriority());
//		System.out.println(Thread.MAX_PRIORITY);
//		System.out.println(Thread.currentThread().getPriority());
		
	}

}
