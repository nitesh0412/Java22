package com.aurionpro.model;

public class printNum extends Thread {

	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{  
			try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			System.out.println(i);
		}
	}

}
