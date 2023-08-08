package com.aurionpro.model;

public class Person {
	
	private int height;
	private int wight;
	
	
	@Override
	public String toString() {
		return "Person [height=" + height + ", wight=" + wight + "]";
	}
	public Person(int height, int wight) {
		super();
		this.height = height;
		this.wight = wight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWight() {
		return wight;
	}
	public void setWight(int wight) {
		this.wight = wight;
	}
	
	
	

}
