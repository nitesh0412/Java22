package com.aurionpro.test;

public class Prime {

	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]); 
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(a + " " + b);
        for(int i=2;i<num;i++)
        {
            c = a+b;
            a = b;
            b = c ;
            System.out.println(c);                
        } 
    }

	}

	


