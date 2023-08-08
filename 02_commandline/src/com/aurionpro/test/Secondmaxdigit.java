package com.aurionpro.test;

public class Secondmaxdigit {

	public static void main(String[] args) {
		
		int maxone = Integer.parseInt(args[0]);
		int maxtwo = Integer.parseInt(args[0]);
		for (int i = 0; i < args.length; i++) {
			if( Integer.parseInt(args[i]) > maxone ){
				maxone = Integer.parseInt(args[i]);
			}
		}
		for (int i = 0; i < args.length; i++) {
			if(Integer.parseInt(args[i]) < maxone &&  Integer.parseInt(args[i]) > maxtwo ){
				maxtwo = Integer.parseInt(args[i]);
			}
		}
		
		System.out.println(maxtwo);
	}

}
