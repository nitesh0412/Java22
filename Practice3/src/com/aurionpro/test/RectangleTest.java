package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.ColourType;
import com.aurionpro.model.Rectangle;

public class RectangleTest {
	
	public static void main(String[] args)

	{	Rectangle[] obj = new Rectangle[3];
		for(int i=0;i<obj.length;i++)
		{
			obj[i] = new Rectangle();
			userinput(obj[i]);
			useroutput(obj[i]);
		}
		
//		Rectangle obj = new Rectangle();
//		userinput(obj);
//		useroutput(obj);
		
		
	}
	
	private static void userinput(Rectangle obj) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a height");
		obj.setHeight(sc.nextDouble());
		System.out.println("Enter a width");
		obj.setWidth(sc.nextDouble());
		System.out.println("Enter a Colour ");
		try {
		obj.setColour(ColourType.valueOf(sc.next().toUpperCase()));}
		catch 
		(IllegalArgumentException e ) {
			obj.setColour(ColourType.RED);
		}
		
	} 
	
	private static void useroutput(Rectangle obj)
	{
		System.out.println("entred height : "+ obj.getHeight());
		System.out.println("entered width : "+ obj.getWidth());
		System.out.println("your colour :"+ obj.getColour());
		System.out.println("area : "+ obj.Calculatearea());
	}
	}
