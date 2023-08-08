package com.aurionpro.model;

import java.time.LocalDate;

public class Student extends Person {
	
	private String branch ;
	
	public Student(int id, String address, LocalDate dateofBirth) {
		super(id, address, dateofBirth);
	}

	

}
