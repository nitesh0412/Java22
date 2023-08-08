package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//list.add("as");
//		System.out.println(list);
//		list.remove(0);
//		System.out.println(list.contains(30));
//		System.out.println(list.size());
//		list.remove(new Integer(3));
//		System.out.println(list);
//		
//		
//		list.set(1, 100);
//		System.out.println(list);
//		method1
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
//		System.out.println("-----");
//		method2
//		for(Integer x:list) {
//			System.out.println(x);
//		}
//		System.out.println("-----");
//	method 3
//		Iterator<Integer> iterator = list.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
		
		//Method 4
//				list.forEach((num)->{
//			System.out.println(num);
//		});
		//Method 5
		
		list.forEach(System.out::println);
		
	}
	
	

}
