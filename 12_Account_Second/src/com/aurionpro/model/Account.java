package com.aurionpro.model;

public class Account {

	private long accountNumber;

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", account="
				+ account + "]";
	}

	private String name;
	private double balance;
	private AccountType account;

	public Account(long accountNumber, String name, double balance, AccountType account) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.account = account;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
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
		return account;
	}

	public void setAccount(AccountType account) {
		this.account = account;
	}

	public boolean deposit(double amount) {
		if (amount < 0)
			return false;
		else
			balance = balance + amount;
		return true;

	}

	public boolean withdraw(double amount)
	{
		if(account.equals(AccountType.SAVING))
		{
			if((balance = balance - amount) >= 1000 )
			{
				balance = balance - amount ;
				return true;
			}
			return false;
		}
		
		else if(account.equals(AccountType.CURRENT))
		{
			if((balance = balance-amount) >= -25000){
			balance = balance - amount;
			return true;}
			return false ;
		}
		return false ;
	}

}
