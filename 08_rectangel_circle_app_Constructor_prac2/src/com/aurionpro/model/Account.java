package com.aurionpro.model;

public class Account {
	private int id ;
	private String name ;
	private double balance ;
	private AccountType Account;
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
	public AccountType getAccount() {
		return Account;
	}
	public void setAccount(AccountType account) {
		Account = account;
	}
	
	
}
