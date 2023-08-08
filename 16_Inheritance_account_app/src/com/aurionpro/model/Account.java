package com.aurionpro.model;

public class Account {
	
	private int id ;
	private String name ;
	protected double balance ;
	
	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean deposit (double amount)
	{
		if(amount < 0)
			return false ;
		else 
			balance = balance +amount ;
			return true;
		
	}
	
	
	public boolean withdraw(double amount)
	{
		balance = amount - balance ;
		return true;
	}

	
	
	
}