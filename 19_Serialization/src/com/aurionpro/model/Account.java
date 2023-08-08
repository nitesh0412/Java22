package com.aurionpro.model;

import java.io.Serializable;

public class Account implements Serializable {
	
	private int id ;	
	private String name ;
	private int balance ;


	public Account(int id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
}
