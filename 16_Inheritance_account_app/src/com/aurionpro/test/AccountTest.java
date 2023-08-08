package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {

		SavingAccount Savingaccount = new SavingAccount(1,"nitesh",10000);
		Savingaccount.withdraw(1900);
		System.out.println(Savingaccount);
		
	}

}
