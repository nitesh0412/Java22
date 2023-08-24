package com.aurionpro.model;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaTest {

	public static void main(String[] args) {
		 IGreetables obj = new WelcomeGreeting();
		 obj.printGreetings();
		
		 IGreetables obj2= ()-> System.out.println("Good day");
		
		 obj2.printGreetings();
//		
//		 IAddable addition = (a,b)-> System.out.println(a+b);
//		 addition.add(20,1);
		 IAddable greetobj = (IAddable::add(9,0));
		 greetobj.add(10,20);
		
		//Consumer 
//		Consumer<String> conobj = (name) -> {
//			System.out.println(name);
//		};
//		conobj.accept("Consumer name ");
//
//		Consumer<Integer> intobj = (x)->
//		{
//			System.out.println(x+x);
//		};
//		intobj.accept(10);
//		
//		//Function 
//		Function<String, Integer> funobj = (name) ->
//		{
//			return name.length();
//		};
//		
//		System.out.println(funobj.apply("Nitesh"));
//		
//		Function<String, String> funobj2 = (name) ->
//		{
//			return name.toLowerCase();
//		};
//		
//		System.out.println(funobj2.apply("Nitesh"));
//		
//		//Predicate
//		
//		Predicate<Integer> preobj = a -> (a > 18);
//		
//		{
//			System.out.println(preobj.test(10));
//			
//		};
//		//Bifunction , biconsumer just same with 2 parametere
//		BiFunctionon<Integer, Integer, Integer> bifunc = (name1 , name2)-> 
//		{
//			return name1+name2 ;
//		};
//		System.out.println(bifunc);
//		
	}
	

	// public static void add(int a, int b) {
	// System.out.println(a + b);
	// }

}
