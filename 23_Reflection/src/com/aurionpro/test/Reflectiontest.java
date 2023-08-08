package com.aurionpro.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Reflectiontest {

	public static void main(String[] args) throws ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter classname");
		String test = sc.nextLine();
		
	Class<?> className = Class.forName(test);
		
		
		Field[] declaredFields = className.getDeclaredFields();
		for(Field f : declaredFields) {
			System.out.println(f);
			
		Constructor<?>[] constructors = className.getConstructors();
		for(Constructor c : constructors) {
			System.out.println(c);
		}
			
		Method[] methods = className.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
		
		Constructor<?>[] constructor2 =Account.class.getConstructors();
		
			for(Constructor c :constructor2)
				System.out.println(c);
		}
		System.out.println(Account.class.getSuperclass());
		
	}
	


		
	}