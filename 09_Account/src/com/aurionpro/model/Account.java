package com.aurionpro.model;

public class Account {

		private int id ;
		private String name;
		private double balance ;
		private Accounttype account;
		
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
		public  AccountType getAccount() {
			return account;
		}
		public void setAccount(Accounttype account) {
			this.account = account;
		}
	
	
	
}
