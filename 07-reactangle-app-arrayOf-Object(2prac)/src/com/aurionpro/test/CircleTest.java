package com.aurionpro.test;
import java.util.Scanner;

import com.aurionpro.model.BorderType;
import com.aurionpro.model.Circle;
import com.aurionpro.model.ColourType;

public class CircleTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle circle=new Circle();
		System.out.println("Enter a radius : ");
		circle.setRadius(sc.nextInt());
		System.out.println("Enter a colour : ");
		try {
		circle.setColour(ColourType.valueOf(sc.next().toUpperCase()));}
		catch (IllegalArgumentException e) {
			circle.setColour(ColourType.RED);
		}
		System.out.println("Enter a border : ");
		try {
		circle.setBorder(BorderType.valueOf(sc.next().toUpperCase()));}
		catch (IllegalArgumentException e) {
			circle.setBorder(BorderType.DASHED);
		}
		
		printAreaAndPerimeter(circle);
		
	}
		
		private static void printAreaAndPerimeter(Circle circle)
		{
			 System.out.println("Hight of rectangle:"+circle.getRadius());
			 System.out.println("Width of rectangle:"+circle.getBorder());
			 System.out.println("Colour of rectangle:"+circle.getColour());
			 System.out.println("area of circle :"+circle.calculateArea());
		}
		
		
	
	
	
	
	
}
