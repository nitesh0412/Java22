package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {
	public static void main(String[] args) {

		String[] names = { "ancd", "asasasas", "aww", "qwee", "lokosaks" };

		List<String> newName = new ArrayList<String>();

		// for (String name : names) {
		// int nameLength = name.length();
		// if (nameLength == 3 || nameLength == 4) {
		// newName.add(name);
		// }
		// }
		//
		// System.out.println("New List: " + newName);
		List<String> list1 = Arrays.asList("cash", "akash ", "Yash", "non", "tna", "nami");
		list1.stream().forEach(System.out::printf);
		list1.stream().filter((list) -> list.length() == 3 || list.length() == 4).forEach(System.out::println);

	}
}
