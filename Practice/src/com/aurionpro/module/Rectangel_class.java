package com.aurionpro.module;

public class Rectangel_class {

	public int height;
	public int width;
	
	public int calculatearea() {
		int area = height * width ;
		return area ;
	}
	public int calculateparameter()
	{
		return (2*height + 2*width);
	}
}
