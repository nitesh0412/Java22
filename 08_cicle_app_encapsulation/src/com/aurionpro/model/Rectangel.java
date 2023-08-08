package com.aurionpro.model;
import com.aurionpro.model.ColourType;

public class Rectangel {
	
	private double height;
	private double width;
	private ColourType colour;
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
	public Rectangel(double height, double width, ColourType colour) {
		super();
		this.height = height;
		this.width = width;
		this.colour = colour;
	}
	public Rectangel(double height, double width) {
		super();
		this.height = height;
		this.width = width;
		colour = ColourType.RED	;
	}
	
	public Rectangel ()
	{
		height = 10;
		width = 10;
		colour = ColourType.RED	;
	}
	public double areaofRectangle()
	{
		return height * width ;
	}
	public double perimeterOfRectangle ()
	{
		return 2*(height *width);
	}
}
