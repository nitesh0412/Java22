package com.aurionpro.model;

public class Account {

		private int accountNumber ;
		private String name;
		private double balance ;
		private final int minbalance= 10000;
		
		public Account(int accountNumber, String name, double balance) {
			super();
			this.accountNumber = accountNumber;
			this.name = name;
			this.balance = balance;
		}
		
		public int getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(int accountNumber) {
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
		
		public void  deposit(double amount) {
			if(amount > 0)
			{
				balance  = balance + amount ;
				System.out.println("Amount deposited "+ balance);
			}
			else
			{
				System.out.println("Invalid amount ");
			}
		}
		public void withdraw(double amount) throws InsufficentBalanceException
		{
			if(balance -amount  >= minbalance )
			{
				balance = balance - amount ;
				System.out.println("Withdraw done : Total amount : "+balance);
			}
			else 
				throw new InsufficentBalanceException(this , amount);
		}
}
