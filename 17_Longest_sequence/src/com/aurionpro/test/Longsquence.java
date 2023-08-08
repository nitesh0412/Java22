package com.aurionpro.test;

public class Longsquence {

		public static void main(String[] args) {
			String input = "asdsddddsda" ;
			
			char[] chars = input.toCharArray();
			char currentChar = chars[0];
			//System.out.println(chars[0]);
			int count = 0;
			char longestchar = chars[0];
			int longcount = 1;
			
			
				for (int i = 1; i < chars.length; i++) {
					if (chars[i] == currentChar) {
						count++;
					} else {
						currentChar = chars[i];
						count = 1;
					}
					if (count > longcount) {
						longestchar = currentChar;
						longcount = count;
					}
				}
				System.out.println("Longest sequence: " + longestchar + " (" + longcount + " times)");
			}

	}


