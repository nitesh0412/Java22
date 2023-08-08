package com.aurionpro.model;

public class ExceptioTest {
	
	public static void main(String[] args) {
		try {
		int a  = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int div=a/b;
		System.out.println(div);
		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("invalid index position");
//		}
		catch(NumberFormatException e) {
			System.out.println("Number execption");
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Number cannot be divided be zero");
		}
		catch(RuntimeException e)
		{
			System.out.println("Exception throw");
		}
		catch (Exception e)
		{
			System.out.println("Run time ");
		}
		finally {
			System.out.println(" finally block");
		}
		System.out.println("Prog is executed ");
		
	}

}
