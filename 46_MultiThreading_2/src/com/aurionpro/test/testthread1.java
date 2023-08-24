package com.aurionpro.test;

import com.aurionpro.model.printNum;

public class testthread1 {
	public static void main(String[] args) {

		printNum t1 = new printNum();
		System.out.println("t1");
		t1.start();
		printNum t2 = new printNum();
		System.out.println("t2");
		t2.start();
		
		t2.setPriority(10);
		System.out.println(t2.getPriority());
		System.out.println(t1.getPriority());
//		t1.setPriority(Thread.MIN_PRIORITY);

	}

}
