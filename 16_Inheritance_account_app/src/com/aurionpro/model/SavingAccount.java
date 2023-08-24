package com.aurionpro.model;

public class SavingAccount extends Account {

	private static final int Min_Balance = 1000;

	public SavingAccount(int id, String name, double balance) {
		super(id, name, balance);
	}

	@Override
	public boolean withdraw(double amount) {
		if (super.getBalance() - amount < Min_Balance) {
			return false;
		}
		super.setBalance(super.getBalance() - amount);
		{
			return true;
		}
	}

}

// private int Min_Balance = 1000;
//
// public boolean deposit(double amount) {
// if (amount < 0)
// return false;
// else
// super.deposit(amount);
// return true;
//
// }
//
//
//
//
// public boolean withdraw(double amount)
// {
// if(account.equals(AccountType.SAVING))
// {
// if((balance = balance - amount) >= 1000 )
// {
// balance = balance - amount ;
// return true;
// }
// return false;
// }
//
// else if(account.equals(AccountType.CURRENT))
// {
// if((balance = balance-amount) >= -25000){
// balance = balance - amount;
// return true;}
// return false ;
// }
// return false ;
// }
