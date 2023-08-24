package com.aurionpro.model;

import com.aurionpro.model.Table;

public class test4 {

	public static void main(String[] args) throws InterruptedException {

		Table table = new Table(5);
		Thread t2 = new Thread(table);
		t2.start();
		Table table2 = new Table(10);
		Thread t1 = new Thread(table2);
		t1.sleep(10000);
		t1.start();
	}
}
