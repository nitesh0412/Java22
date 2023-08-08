package com.aurionpro.model;

public  class Circle extends Shape {
	
	private double radius ;

	public Circle(colourtype colour, bordertype border, double radius) {
		super(colour, border);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculatearea() {
		
		return 3.14*radius*radius;
	}

	
	
	

	
	

}
