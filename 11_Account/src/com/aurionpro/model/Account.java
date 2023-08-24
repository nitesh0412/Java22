package com.aurionpro.model;

import com.aurionpro.test.Typeaccount;

public class Account {

	private long AccountNumber;

	public Account(long accountNumber, String name, double balance, Typeaccount account) {

		AccountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.account = account;
	}

	private String name;
	private double balance;
	private Typeaccount account;

	public long getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
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

	public Typeaccount getAccount() {
		return account;
	}

	public void setAccount(Typeaccount account) {
		this.account = account;
	}

	private boolean validate(double amount) {

		return amount > 0.0;
	}

	public void deposit(double amount) {

		if (validate(amount)) {
			this.balance += amount;

		}

	}

	public void withdraw(double amount) {

		if (this.account.equals(Accountype.CURRENT) && validate(amount)) {
			this.balance += 25000;
			this.balance -= amount;

		} else {
			this.balance -= amount;
		}
	}

}
