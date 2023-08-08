package com.aurionpro.model;

public class SavingAcc extends Account{
		

	public  static final int min =1000;
	
	

	public SavingAcc(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}
	



	@Override
	public boolean withdraw(double amount)
	{	double balance = getBalance();
		if( (balance=-amount ) > min )
		{
			return true ;
		}
		return false ;
	}

	

}
