package com.aurionpro.model;

public class PrintValue<T extends Rectangel> {

	private T number ;
	
	public PrintValue (T number)
	{super();
	this.number = number ;
	
	}
	public void print()
	{
		System.out.println(number);
	}
	
}
