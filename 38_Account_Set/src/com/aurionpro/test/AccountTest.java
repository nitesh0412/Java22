package com.aurionpro.test;

import java.util.HashSet;
import java.util.Set;

import com.aurionpro.model.Account;

public class AccountTest {
	
	public static void main(String[] args) {
		
		Set<Account> acc = new HashSet<>();
		acc.add(new Account(1,"nitesh",89));
		acc.add(new Account(2,"nitesh",89));
		acc.add(new Account(3,"abcd",90));
		acc.add(new Account(4,"nitesh",89));
		acc.add(new Account(5,"qwe",12));

		
		for(Account x : acc)
		{
			System.out.println(x);
		}
		
	}

}
