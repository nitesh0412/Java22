package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class mapTest {

	public static void main(String[] args) {
		Map<Integer, String> nameMap = new HashMap<>();
		nameMap.put(1, "Nitesh");
		nameMap.put(2, "yash");
		nameMap.put(3, "akash");
		Scanner sc = new Scanner(System.in);
		Set<Entry<Integer, String>> entrySet = nameMap.entrySet();

		// for(Entry x : entrySet)
		// {
		// System.out.println(x.getKey() + " "+ x.getValue());
		// }

		// System.out.print("Name");
		// String nameToRemove = sc.nextLine();
		// if (nameMap.containsValue(nameToRemove)) {
		// for (Map.Entry<Integer, String> entry : nameMap.entrySet()) {
		// if (entry.getValue().equals(nameToRemove)) {
		// nameMap.remove(entry.getKey());
		// break;
		// }
		// }
		// System.out.println("" + nameToRemove + "': " + nameMap);
		// } else {
		// System.out.println("'" + nameToRemove + "' not found in the map.");
		// }

		String inputName = sc.nextLine();

		if (nameMap.containsValue(inputName)) {
			nameMap.values().removeIf(value -> value.equals(inputName));
			nameMap.forEach((key, value) -> {
				System.out.println(key + " " + value);
			});
			System.out.println("Name removed from the map.");
		} else {
			System.out.println("Name does not exist.");
		}
		sc.close();

		nameMap.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});

	}

}
