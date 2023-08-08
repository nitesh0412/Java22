package com.aurionpro.model;

public class Manager extends Employee {
	
	private double hra = (getBasic()*0.25);
	private double da = (getBasic()*0.15);
	private double ta = (getBasic()*0.10);


	public Manager(int id, String name, double basic) {
		super(id, name, basic);
		this.hra = hra;
		this.da = da;
		this.ta = ta;
	}

	@Override
	public double calculatemonthlysalary()
	{
		double amount  = hra + da + ta + getBasic();
		return amount;
		
	}
	
	@Override
	public double calculateannualsalary()
	{
		return (calculatemonthlysalary() * 12);
	}

	@Override
	public String toString() {
		return "Manager [hra=" + hra + ", da=" + da + ", ta=" + ta + "]";
	}

	
	

}
