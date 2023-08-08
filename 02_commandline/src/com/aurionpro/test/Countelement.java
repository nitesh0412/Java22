package com.aurionpro.test;

public class Countelement {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < args.length; i++) {
			for(int j =0;j < args.length; j++) {
			
				if(Integer.parseInt(args[i]) == Integer.parseInt(args[j]) ) {
				count ++ ;	
			}
		}
			System.out.println(Integer.parseInt(args[i])+ " " + count);
			count = 0 ;
	}

}
}