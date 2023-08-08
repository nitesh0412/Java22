package com.aurionpro.test;
import java.util.Scanner;

import com.aurionpro.module.ColorType;
import com.aurionpro.module.Rectangel_class;

public class rectangel {
	
	public static void main(String args[])
	{
		Rectangel_class rectangel = new Rectangel_class();
		input(rectangel);
		output(rectangel);
		
		Rectangel_class rectangel2 = new Rectangel_class();
		input(rectangel2);
		output(rectangel2);
		
		
	}
	
	
	public static void input(Rectangel_class rectangel)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a height : ");
		rectangel.setheight(sc.nextInt());
		System.out.println("Enter a width : ");
		rectangel.setwidth(sc.nextInt());
		System.out.println("Enter a color : ");
		try{
			rectangel.setcolour(ColorType.valueOf(sc.next().toUpperCase())); 		
		}
		catch (IllegalArgumentException e) {
			rectangel.setcolour(ColorType.RED); 
		}
		
	}

	public static void output(Rectangel_class rectangel)
	{
		System.out.println("entered height is : " + rectangel.getheight());
		//System.out.println("entered width is : " + rectangel.getwidth());
		System.out.println(rectangel.caculatearea());
	}
	
}
