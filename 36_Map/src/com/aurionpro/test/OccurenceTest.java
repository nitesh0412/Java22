package com.aurionpro.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurenceTest {
	
	public static void main(String[] args) {
		
		List<Integer> numberList = Arrays.asList(10, 20, 20, 30, 20, 40, 50, 90);
		
		Map<Integer, Integer> count = new HashMap<>();
		
		
		for (Integer x : numberList) {
			if(!count.containsKey(x)) {
				count.put(x,1);
			}
			else {
				count.put(x,count.get(x)+1);
			}
		}
		
		
	}
}