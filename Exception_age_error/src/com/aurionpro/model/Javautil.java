package com.aurionpro.model;

import com.aurionpro.exception.Invalidageexception;

public class Javautil {

	public static String agevalidate(int age ) throws Invalidageexception 
	{
			if(age >= 18)
			{
				return("eligibale for voting");
			}
			else
			{
			throw new Invalidageexception("Invalid age");
			}
	}
}
