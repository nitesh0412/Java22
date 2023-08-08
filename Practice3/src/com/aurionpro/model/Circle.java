package com.aurionpro.model;

public class Circle {
	private double radius ;
	private ColourType Colour ;
	private BorderType Border ;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public ColourType getColour() {
		return Colour;
	}
	public void setColour(ColourType colour) {
		Colour = colour;
	}
	public BorderType getBorder() {
		return Border;
	}
	public void setBorder(BorderType border) {
		Border = border;
	}
	
	public double validate (int value)
	{
		if(value < 0) {
			value = 1;}
		
		return value ;
	}
	public double area( )
	{
		return (Math.PI*radius*radius);
	}
}
