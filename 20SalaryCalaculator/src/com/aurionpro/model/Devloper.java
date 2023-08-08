package com.aurionpro.model;

public class Devloper extends Employee{

	private double pa = (getBasic()*0.30);
	private double ota = (getBasic()*0.20);

	public Devloper(int id, String name, double basic) {
		super(id, name, basic);
		this.pa = pa;
		this.ota = ota;
	}

	

	@Override
	public String toString() {
		return "Devloper [pa=" + pa + ", ota=" + ota + "]";
	}



	@Override
	public double calculatemonthlysalary() {
		return pa+ota+getBasic();
	}

	@Override
	public double calculateannualsalary() {
		return (calculatemonthlysalary() * 12);

	}
	

	
}
