package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.AccountType;

public class AccountTest {

	public static void main(String[] args) {
		Account[] account = new Account[10];
		account[0] = new Account(1, "Yash", 1000.0, AccountType.SAVING);
		account[1] = new Account(2, "Raj", 1000.0, AccountType.CURRENT);
		account[2] = new Account(3, "akash", 1000.0, AccountType.SAVING);
		account[3] = new Account(4, "nitish", 1000.0, AccountType.SAVING);
		account[4] = new Account(5, "Surja", 0.0, AccountType.CURRENT);
		account[5] = new Account(6, "Sarah", 1000.0, AccountType.SAVING);
		account[6] = new Account(7, "David", 1000.0, AccountType.CURRENT);
		account[7] = new Account(8, "Emily", 1000.0, AccountType.SAVING);
		account[8] = new Account(9, "Mark", 1000.0, AccountType.CURRENT);
		account[9] = new Account(10, "Linda", 1000.0, AccountType.SAVING);
	
		Account acc = highest(account);
		System.out.println(acc);
		Account savingacc = highestforsaving(account, AccountType.SAVING);
		System.out.println("highest for saving acc "+ savingacc);
		System.out.println("SUM of saving acc : " + balanceofsaving(account));
		System.out.println("least for current "+ leastbalancecurrent(account));
			

	}
	private static Account highest(Account[] account)
	{
		Account max = account[0];
		for(int i=0;i<account.length;i++)
		if(max.getBalance() < account[i].getBalance())
		{
			max = account[i];
		}
		return max ;
	}
	
	private static Account highestforsaving(Account[] account , AccountType ac )
	{	//if (account[i].getAccountType().equals("SAVING")) {
		Account max = account[0]; 
		for(int i=0;i<account.length;i++)
		{
			if(max.getBalance() < account[i].getBalance())
			{
				max = account[i];
			}
		}
		return max ; 
	}
	
	private static double balanceofsaving(Account[] account)
	{
		double total = 0;
		for(int i=0;i<account.length;i++)
		{
			total = total + account[i].getBalance() ;
		}
		return total;
	}
	private static Account leastbalancecurrent(Account[] account)
	{	Account min = account[4];
		if(account.equals("CURRENT"))
		 
			{	 
				for(int i=0;i<account.length;i++)
				{
					if(min.getBalance() > account[i].getBalance())
					{
						min = account[i];
					}
				}
			}
		
		return min ;
	}
}
