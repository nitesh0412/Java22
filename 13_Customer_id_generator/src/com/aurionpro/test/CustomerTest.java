package com.aurionpro.test;

import com.aurionpro.model.Customer;

public class CustomerTest {
	public static void main(String[] args)
	{
		Customer customer1 = new Customer("temp");
		System.out.println(customer1.getId());


		Customer customer2 = new Customer("Nites");
		System.out.println(customer2.getId());


		Customer customer3 = new Customer("anonymous");
		Customer customer4 = new Customer("temp2");

		System.out.println(customer3.getId());
		System.out.println(customer4.getId());

		
	}
	 
}
