package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest { 
	public static void main(String[] args)
	{
		
		Account account1 = new Account(21,212,"Nitesh");
		Account account2 = new Account(20);
		Account account5 = new Account(25,1232,"temp");
		Account account3 = new Account(21);
		Account account4 = new Account(24);
		
		
		System.out.println(Account.getCount());
	}
	
	

		
}
