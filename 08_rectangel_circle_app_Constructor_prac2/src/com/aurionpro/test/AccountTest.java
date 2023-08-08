package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		
		Account[] acc = new Account[10];
		
		for(int i=0;i<acc.length;i++)
		{
			acc[i] = new Account();
			acc[i].setId(i);
			
		}
	}
	
	
	private static void userinput(Account acc)
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name ");
		acc.setName(sc.next());
		System.out.println("Enter a Balance ");
		acc.setBalance(sc.nextDouble());
		System.out.println("Enter a accountType :");
		acc.setAccount(account);
	}

}
