package com.aurionpro.model;

public class InsufficentBalanceException extends Exception {

	private double amount;
	private Account account;
	 private static final long serialVersionUID = 1L;

	public InsufficentBalanceException(Account account, double amount) {
		this.amount = amount;
		this.account = account;
	}
	
	@Override
    public String getMessage() {
		return "Insufficient balance in account |" + "your current balance is "+ account.getBalance();
		
    }

	@Override
	public String toString() {
		return "InsufficentBalanceException [amount=" + amount + ", account=" + account + "]";
	}
	
	

}
