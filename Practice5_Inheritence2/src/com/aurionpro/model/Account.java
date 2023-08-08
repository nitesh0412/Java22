package com.aurionpro.model;

public class Account {

	private int id ;
	private String name ;
	private double balance;

	
	
	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	

	public void setBalance(double balance)
	{
		this.balance = balance ;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	
	public void setName(String name)
	{
		this.name = name ;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean deposit(double amount)
	{
		if(amount > 0)
		{
			balance = balance + amount ;
			return true ;
		}else 
			return false;
	}
	public boolean withdraw (double amount)
	{
		balance = balance - amount ;
		return true ;
	}
	
}