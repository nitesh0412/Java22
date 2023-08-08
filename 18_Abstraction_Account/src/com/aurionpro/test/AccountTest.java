
package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.SavingAcc;

public class AccountTest {
	
	public static void main(String[] args) {
		Account acc1 = new SavingAcc(1,"Nitesh",1000);
				System.out.println(acc1.deposit(10000));
				//System.out.println(Account.getBalance());
				
	}

}
