package com.aurionpro.test;
public class Passbyvalue_2 {

	public static void main(String[] args) {
		int [] num = {10,20,30,40};
		
		incbyone(num);
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}

	private static void incbyone(int[] x) {
//		for( int i : num) {
//			i++ ;
//		}
		
		for(int i=0;i<x.length;i++)
			x[i]++;
	}

}
