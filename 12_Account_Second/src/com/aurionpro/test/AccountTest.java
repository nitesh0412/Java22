package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.AccountType;

public class AccountTest {
	
	public static void main(String[] args)
	{
		Account[] account = new Account[2];
		account[0] = new Account(101, "Nitesh", 100, AccountType.CURRENT);
		//printdeposit(account,account[0].deposit(234));
		printwithdraw(account,account[0].withdraw(200));
		
	}

	private static void printdeposit(Account[] account, boolean deposit)
	{
		if(deposit)
		{System.out.println("Amount deposits ");}
		else
		{System.out.println("Amount not deposit");}
	}
		private static void printwithdraw(Account[] account, boolean deposit) 
		{
			if(deposit)
			{System.out.println("Amount withdraw ");}
			else
			{System.out.println("Amount not withdrwal");}
			
		}



}