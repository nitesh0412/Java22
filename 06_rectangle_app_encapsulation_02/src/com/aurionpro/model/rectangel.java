package com.aurionpro.model;

public class rectangel {
	private double height;
	private double width;
	
	
	public void setheight(double height) {
		this.height=height;
	}
	public void setwidth(double width) {
		this.width = width;
	}
	
	public double gethieght()
	{
		return height;
	}
	public double getwidth()
	{
		return width;
	}
	
	public double  calculatorarea()
	{
		 return( height * width);
	}

	public double  calculatperameter()
	{
		 return( 2*getHeight() + 2 * width);
	}
	
//	public void setHeight(double height) {
//		this.height = height;
//	}

}
