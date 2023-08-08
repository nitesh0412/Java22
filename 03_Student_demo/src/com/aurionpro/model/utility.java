package com.aurionpro.model;

public class utility { 
	
	public int findFactorial(int num) {
	int sum =1;
	for(int i=1;i<=num;i++)
    {
        sum = sum * i;
    }
	return sum;
    }
	
    public boolean isPrime(int num){
    	
    	boolean flag = false;

        for  (int i = 2; i <= num / 2; ++i) {
          
          if (num % i == 0) {
            flag = true;
            break;
          }
          if (!flag)
              	return true;
            else
            	return false;
          }
		return flag;
    	
    }
}
