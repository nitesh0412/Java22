package com.aurionpro.test;

import com.aurionpro.model.BMI_Calc;
import com.aurionpro.model.Person;
import com.aurionpro.model.SavingAccount;

public class BMI_test {

	    public static void main(String[] args) 
	    {
	        Person person = new Person(170, 65);
	        double bmi = BMI_Calc.BMICalculate(person);

	        double bmi = new BMI_Calc(170, 65);
	        bmi.BMICalculate();
	        System.out.println("BMI" + bmi);
//	        String bodyType = BMI_Calc.BodyType(bmi);
//	        System.out.println("Body Type: " + bodyType);
	    }
	}
