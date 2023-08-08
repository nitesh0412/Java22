package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.InsufficentBalanceException;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account(1234, "Nitesh", 12000);

		try {
			account.deposit(200);
			account.withdraw(1000);
			account.withdraw(1300000);

		} catch (InsufficentBalanceException ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}

	

}
