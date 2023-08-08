package com.aurionpro.test;
import java.util.Scanner;

import com.aurionpro.model.rectangel;

public class RectangelTest {
	
	public static void main(String[] agrs)
	{	
		rectangel Rectangel = new rectangel();
		input (Rectangel) ;
		print(Rectangel);
		
		rectangel Temp = new rectangel();
		input(Temp);
		print(Temp);
	}
		
		
		public static void input(rectangel Temp) {
		Scanner sc = new Scanner(System.in);
		Temp.setheight(sc.nextDouble());
		Temp.setwidth(sc.nextDouble());
		}
		
		public static void print(rectangel Temp ) {
		System.out.println("hight"+Temp.gethieght());
		System.out.println(Temp.calculatorarea());
		System.out.println(Temp.calculatperameter());
		
		}
	
	
}

