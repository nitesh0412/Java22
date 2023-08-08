package com.aurionpro.com;

import com.aurionpro.com.opration;

public class test {
	
	public static void main(String[] args) {
	opration student = new opration(10,"we",2,true) ;

	System.out.println(student.id);
	System.out.println(student.multi());
	System.out.println(student.sum());
	}
}
