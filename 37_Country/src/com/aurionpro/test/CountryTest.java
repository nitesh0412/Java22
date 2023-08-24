package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import javax.naming.InvalidNameException;

import com.aurionpro.model.CountryInfo;

public class CountryTest {

	public static void main(String[] args) {
		Map<String, CountryInfo> countryMap = new HashMap<String, CountryInfo>();

		try {
			BufferedReader br = new BufferedReader(
					new FileReader("D:\\AurionproJava22\\java2022\\37_Country\\src\\text.txt"));
			String line = br.readLine();

			while (line != null) {
				String[] arr = line.split(",");
				if (arr.length == 3) {
					String key = arr[0].trim().replaceAll("\"", "");
					String value1 = arr[1].trim().replaceAll("\"", "");
					int value2 = Integer.parseInt(arr[2].trim());
					countryMap.put(key, new CountryInfo(value1, value2));

				}
				line = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Set<Entry<String, CountryInfo>> entrySet = countryMap.entrySet();
		Scanner userin = new Scanner(System.in);
		System.out.println(
				"Enter 1 for Country ID \n" + "Enter 2 for country name \n" + "Enter 3 for region ");
		int userinput = userin.nextInt();
		switch (userinput) {
		case 1:
			try {
				Boolean foundFlag = false;
				System.out.println("Enter country ID");
				String countryIDFromUser = userin.next();
				if (countryIDFromUser.length() > 2) {
					throw new NumberFormatException("ID length cannot be greater than 2");
				}
				for (Entry<String, CountryInfo> entry : entrySet) {
					if (entry.getKey().equalsIgnoreCase(countryIDFromUser)) {
						System.out.println("Found");
						foundFlag = true;
						System.out.println(entry.getKey() + " " + entry.getValue());
					}
				}
				if (!foundFlag) {
					System.out.println("Not Found");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			break;

		case 2:
			try {
				System.out.println("Enter country Name");
				userin.nextLine();
				Boolean foundFlag = false;
				String countryNameFromUser = userin.nextLine();
				if (checkInputForDigits(countryNameFromUser)) {
					throw new InvalidNameException("Name cannot contain number");
				}
				for (Entry<String, CountryInfo> entry : entrySet) {
					if (entry.getValue().getCountryName().equalsIgnoreCase(countryNameFromUser)) {
						System.out.println("Found");
						System.out.println(entry.getKey() + " " + entry.getValue());
						foundFlag = true;
					}
				}
				if (!foundFlag) {
					System.out.println("Not Found");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			break;

		case 3:
			try {
				System.out.println("Enter Region ID");
				int regionIDFromUser = userin.nextInt();
				if (regionIDFromUser > 4) {
					throw new IllegalArgumentException("Invalid Region ID");
				}
				for (Entry<String, CountryInfo> entry : entrySet) {
					// System.out.println(entry.getKey()+" "+entry.getValue());
					if (entry.getValue().getId() == regionIDFromUser) {
						System.out.println("Found");
						System.out.println(entry.getKey() + " " + entry.getValue());
						// foundFlag = true;
					}
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			break;

		default:
			System.out.println("Invalid user input");
		}

	}

	public static boolean checkInputForDigits(String input) {
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isDigit(charArray[i])) {
				return true;
			}
		}
		return false;
	}

}