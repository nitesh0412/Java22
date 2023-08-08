package com.aurionpro.module;

public class Rectangel_class {
	
	private int height;
	private int width;
	private ColorType colour ; 
	

	public ColorType getcolour ()
	{
		return colour ;
	}
	public void setcolour ()
	{
		this.colour = colour ;
	}
	public void setheight(int num)
	{	
		
		height = userinputtest(num) ;
	}
	public void setwidth(int num)
	{	
		width = userinputtest(num) ;
	}
	
	public int getheight()
	{
		return height;
	}
	
	
	private int userinputtest(int value) 
	{
		if (value < 0)
			value = 1 ;
		else if(value > 100)
			value = 100;
		
		return value ;
	}
	public int caculatearea()
	{
		return( height * width);
	}
	

}	
















//	private int height ;
//	public int width ;
//	
//	public void setheight(int num)
//	{
//		 if(num <  0) {
//			 height = -num;
//		 }
//	}
//	
//	public int getheight()
//	{
//		return 2*height;
//	}
//	
//	public int calculatearea() {
//		return (getheight() * width);
//	}
//	public int calculatparam() {
//		return (2*this.height + 2*width);
//	}
//	


