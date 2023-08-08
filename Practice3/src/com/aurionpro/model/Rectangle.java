package com.aurionpro.model;

public class Rectangle {
	
	private double height ;
	private double width ;
	private ColourType Colour ;
	
	public double validate (double value)
	{
		if(value < 0) {
			value = 1;}
		
		return value ;
	}

	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = validate(height);
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = validate(width);
	}
	public ColourType getColour() {
		return Colour;
	}
	
	public void setColour(ColourType Colour)
	{
		this.Colour = Colour ;
	}
	
	
	public double Calculatearea()
	{
		return (height*width);
	}
	
}
