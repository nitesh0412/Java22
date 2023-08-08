package com.aurionpro.test;
import java.util.Scanner;
import com.aurionpro.module.Rectangel_class;

public class Rectangel_object {
	public static void main(String[] agrs)
	{
	Scanner sc = new Scanner(System.in);
	Rectangel_class Rectangel = new Rectangel_class();
	System.out.println("Enter a height : ");
	Rectangel.height = sc.nextInt();
	System.out.println("Enter a width : ");
	Rectangel.width = sc.nextInt();
	System.out.println(Rectangel.calculatearea());
	System.out.println(Rectangel.calculateparameter());

	
	Rectangel_class Recatngel2 = new Rectangel_class();
	Recatngel2.height = sc.nextInt();
	Recatngel2.width = sc.nextInt() ;
	System.out.println(Recatngel2.calculateparameter());
	
	}

}
