package com.aurionpro.model;

public class test5 {

	public static void main(String[] args) {
		Runnable task = () -> {
			for (int i = 0; i < 3; i++) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		for (int i = 0; i < 10; i++) {
			String name = "thread " + i;
			Thread temp = new Thread(task, name);
			temp.start();
		}
	}

}
