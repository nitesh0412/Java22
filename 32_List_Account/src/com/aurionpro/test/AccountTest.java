package com.aurionpro.test;

import java.util.*;

import java.util.List;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		List<Account> account = new ArrayList<>();
		account.add(new Account(1, "Nitesh", 232343));
		account.add(new Account(1,"Abc",1230));
		account.add(new Account(3, "anonymous", 678854));
		account.add(new Account(4, "roy", 1234));

//		List<Account> account2 = new ArrayList<>();
//		account2.add(new Account(1,"Abc",1230));
//		System.out.println(account.containsAll(account2));
		
		
		// System.out.println(account);
		List<Account> highbalance = new ArrayList<Account>();
		for (Account x : account) {
			if (x.getBalance() >= 2000) {
				highbalance.add(x);
			}
		}
		Collections.sort(account,Collections.reverseOrder());
		
		
		System.out.println(account);
		

		//System.out.println(highbalance);
	}

}
