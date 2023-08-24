package com.aurionpro.model;

import java.util.Arrays;
import java.util.List;

public class Generic {

	public static void main(String[] args) {
		//
		// PrintValue<Rectangel>printobj = new PrintValue <Rectangel>(new
		// Rectangel(10.9f,20.9f));
		// printobj.print();

		PrintValue(10, "Nitesh");
		PrintValue(12, 12);
		List<Integer> intList = Arrays.asList(10, 20, 30);
		printList(intList);
		List<Integer> intList2 = Arrays.asList(4, 5, 6);
		printList(intList2);

	}

	private static void printList(List<?> list) {
		for (Object x : list) {
			System.out.println(x);
		}

	}

	public static <T, S> void PrintValue(T value1, S value2)

	{
		System.out.println(value1);
		System.out.println(value2);
	}
}
