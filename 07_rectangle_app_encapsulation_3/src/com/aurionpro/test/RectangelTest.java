package com.aurionpro.test;
import java.util.Scanner;

import com.aurionpro.model.rectangel;

public class RectangelTest {
	
	public static void main(String[] agrs)
	
		
	{
	rectangel[] rect = new rectangel[5];
	for(int i=0;i<rect.length;i++) {
		rect[i]=new rectangel();
		input(rect[i]);
		print(rect[i]);
	
	}
		public static void input(rectangel Temp) {
		Scanner sc = new Scanner(System.in);
		Temp.setheight(sc.nextDouble());
		Temp.setwidth(sc.nextDouble());
		}
		
		public static void print(rectangel Temp ) {
		System.out.println("hight"+Temp.gethieght());
		System.out.println("width"+ Temp.getwidth());
		System.out.println(Temp.calculatorarea());
		System.out.println(Temp.calculatperameter());
		
		}
	
		rectangel Rectangel = new rectangel();
		input (Rectangel) ;
		print(Rectangel);
		
		rectangel Temp = new rectangel();
		input(Temp);
		print(Temp);
		}
		}

