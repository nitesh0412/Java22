package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BorderType;
import com.aurionpro.model.Circle;
import com.aurionpro.model.ColourType;

public class CircleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle circle = new Circle();

		System.out.println("Enter radius of the circle:");
		circle.setRadius(sc.nextDouble());

		System.out.println("Enter color of the circle:");
		try {
			circle.setColour(ColourType.valueOf(sc.next().toUpperCase()));
		} catch (IllegalArgumentException e) {
			circle.setColour(ColourType.RED);
		}

		System.out.println("Enter border type of the circle:");
		try {
			circle.setBorder(BorderType.valueOf(sc.next().toUpperCase()));
		} catch (IllegalArgumentException e) {
			circle.setBorder(BorderType.SOLID);
		}

		printAreaAndPerimeter(circle);
	}

	private static void printAreaAndPerimeter(Circle circle) {
		System.out.println("Radius of the circle: " + circle.getRadius());
		System.out.println("Color of the circle: " + circle.getColour());
		System.out.println("Border type of the circle: " + circle.getBorder());
		System.out.println("Area of the circle: " + circle.calculateArea());
		System.out.println("Perimeter of the circle: " + circle.calculateperimeter());
	}
}
