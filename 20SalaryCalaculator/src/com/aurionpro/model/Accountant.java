package com.aurionpro.model;

public class Accountant extends Employee  {


	private double hra = getBasic()*0.25;
	private double ma = getBasic()*0.15;
	

		public Accountant(int id, String name, double basic) {
		super(id, name, basic);
	}


		@Override
		public double calculatemonthlysalary() {
			return hra+ma+getBasic();
		}


		@Override
		public double calculateannualsalary() {
			return (calculatemonthlysalary() * 12);
		}


		@Override
		public String toString() {
			return "Accountant [hra=" + hra + ", ma=" + ma + "]";
		}


		

}
