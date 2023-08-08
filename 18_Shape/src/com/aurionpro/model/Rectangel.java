package com.aurionpro.model;

public class Rectangel extends Shape {

	private double height;
	private double width;
	
	public Rectangel(colourtype colour, bordertype border, double height, double width) {
		super(colour, border);
		this.height = height;
		this.width = width ;
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

	public double calculatearea() {
		return (height * width);
	}

}
