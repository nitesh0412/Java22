package com.aurionpro.model;

public class Rectangle {

	private double height;
	private double width;
	private ColourType colour;

	public double validate(int value ) {
	 if(value  <1)
	 {
		 return  1;
	 }
	 else if(value >100) {
		 return 100;
	 }

	 	else 
	{
		 return value;
	}
 
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public ColourType getColour() {
		return colour;
	}

	public void setColour(ColourType colour) {
		this.colour = colour;
	}
	
	public double area() {
		 return height*width;
		 
	 }	 public double perimeter() {
		 return 2*(height+width);
		 
	 }

}
