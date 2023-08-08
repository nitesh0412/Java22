package com.aurionpro.model;

public class rectangel {

	
	
	 private double height;
	 private double width;
	
	 private double checkinput(double value)
	 {
	 if(value<1)
	 return 1;
	 else if(value > 100)
	 {
	 return 100;
	 }
	 else return value;
	 }
	
	
	 public void setheight(double height) {
	 this.height = checkinput(height);
	 }
	
	 public void setwidth(double width) {
	 this.width = checkinput(width);
	 }
	
	 public double gethieght()
	 {
	 return height;
	 }
	 public double getwidth()
	 {
	 return width;
	 }
	
	 public double calculatorarea()
	 {
	 return( getHeight() * width);
	 }
	
	 public double calculatperameter()
	 {
	 return( 2*getHeight() + 2 * width);
	 }
	 public double getHeight() {
	 return height;
	 }
	 public void setHeight(double height) {
	 this.height = height;
	 }

}
