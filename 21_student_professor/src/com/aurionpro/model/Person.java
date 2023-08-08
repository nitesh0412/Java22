package com.aurionpro.model;

import java.time.LocalDate;

public  class  Person {
	private int id;
	private String address ;
	private LocalDate DateofBirth;
	
	public Person(int id, String address, LocalDate dateofBirth) {
		super();
		this.id = id;
		this.address = address;
		DateofBirth = dateofBirth;
	}
	
	

}
