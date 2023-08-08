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
		Temp.height = sc.nextDouble();
		Temp.width= sc.nextDouble();
		}
		
		public static void print(rectangel Temp ) {
		System.out.println(Temp.calculatorarea());
		System.out.println(Temp.calculatperameter());
		
		}
	
	
}
//		Scanner sc = new Scanner(System.in);
//		
//		
//	
//		rectangel Rectangel = new rectangel();
//		Rectangel.height = sc.nextInt();
//		Rectangel.width= sc.nextInt();
//		System.out.println(Rectangel.calculatorarea()); 
//		System.out.println(Rectangel.calculatperameter());
//		
//		rectangel Recatangel2 = new rectangel();
//		Recatangel2.height = sc.nextInt();;
//		Recatangel2.width= sc.nextInt();
//		System.out.println(Recatangel2.calculatorarea()); 
//		System.out.println(Recatangel2.calculatperameter());
//		
//	}
	

