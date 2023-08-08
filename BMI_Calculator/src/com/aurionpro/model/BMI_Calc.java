package com.aurionpro.model;

public class BMI_Calc  {
	
//	private int height;
//	private int wight;
//	
//	public BMI_Calc(int height, int wight) {
//		this.height;
//		this.wight;
//		
//	}
    
	public static double BMICalculate(Person person)
	{
        
        return (100*100*getWight)/(height*height);
    }

		public static String BodyType(double bmi) {
	        if (bmi < 18.5) {
	            return "Underweight";
	        } else if (bmi >= 18.5 && bmi < 25) {
	            return "Normal weight";
	        } else if (bmi >= 25 && bmi < 30) {
	            return "Overweight";
	        } else {
	            return "Obese";
	        }
	    }
		
	}

