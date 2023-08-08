package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BorderType;
import com.aurionpro.model.Circle;
import com.aurionpro.model.ColourType;

public class CircleTest {
	public static void main(String[] args)

	{	
		Circle cr = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a raduis : ");
		cr.setRadius(sc.nextDouble());
		System.out.println("Enter a colour ");
		try {
			cr.setColour(ColourType.valueOf(sc.next().toUpperCase()));
		} catch (IllegalArgumentException e) {
			cr.setColour(ColourType.RED);}
		System.out.println("Enter a border: ");
		cr.setBorder(BorderType.valueOf(sc.next().toUpperCase()));
		
		printAreaAndPerimeter(cr);
	}
	
	private static void printAreaAndPerimeter(Circle cr) {
		System.out.println("Hight of rectangle:" + cr.getRadius());
		System.out.println("Width of rectangle:" + cr.getBorder());
		System.out.println("Colour of rectangle:" + cr.getColour());

		System.out.println("area of circle :" + cr.area());
//		System.out.println("perimeter:" + cr.calculateperimeter());

	}

}
