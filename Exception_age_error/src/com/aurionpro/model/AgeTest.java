package com.aurionpro.model;

import java.util.Scanner;

import com.aurionpro.exception.Invalidageexception;

public class AgeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		try {
			String validateagemsg = Javautil.agevalidate(age);

			System.out.println(validateagemsg);
		} catch (Invalidageexception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End code");
	}

}
