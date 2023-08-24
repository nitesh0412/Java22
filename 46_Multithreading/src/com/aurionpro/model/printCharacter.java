package com.aurionpro.model;

public class printCharacter implements Runnable {
	@Override
	public void run() {
		for (int i = 'A'; i < 'K'; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println((char) i);
		}
	}
}
