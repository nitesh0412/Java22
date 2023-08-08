package com.aurionpro.model;

import java.time.LocalDate;

public class Professor extends Person implements SalariedEmployee {
	private double salary ;
	
	

	public Professor(int id, String address, LocalDate dateofBirth, double salary) {
		super(id, address, dateofBirth);
		this.salary = salary;
	}


	public double  calculateSalary() {
		return salary;
	}


}
