package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;
import com.aurionpro.model.AccountType;

public class AccountTest {

		public static void main(String[] args) {
			List<Account> accounts=new ArrayList<>();	
			   accounts.add(new Account(7, "nitesh", "M",1000, AccountType.CURRENT));
			   accounts.add(new Account(1, " v", "M",200000, AccountType.CURRENT));
			   accounts.add(new Account(2, " Om", "M",201000, AccountType.SAVING));
			   accounts.add(new Account(3, " Sanvi ", "F",100000, AccountType.SAVING));
			   accounts.add(new Account(4, "Akansha", "F",150000, AccountType.CURRENT));
			   accounts.add(new Account(5, "Yash ", "M",300000, AccountType.CURRENT));
			   accounts.add(new Account(6, "shreya ", "F",20000, AccountType.CURRENT));
			   accounts.add(new Account(8, "rohit", "M",30000, AccountType.SAVING));

//
//			    accounts.stream().filter((account)->account.getBalance()<100000).
//			    forEach(System.out::println);
			  
			   List<String> names = accounts.stream()
					   .map((account) -> account.getName())
					   .collect(Collectors.toList());
			   System.out.println(names);
		}


	   }
