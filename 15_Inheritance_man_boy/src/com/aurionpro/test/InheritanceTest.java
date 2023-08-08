package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class InheritanceTest {
	public static void main(String[] args) {
		
//		Man man = new Man();
//		man.read();
//		man.play();
//		
//		System.out.println("-------------------");
//		
//		Boy boy = new Boy();
//		boy.eat();
//		boy.play();
//		boy.read();
//		
//		System.out.println("-------------------");
//
//		Kid kid = new Kid();
//		kid.play();
//		kid.read();
//		
//		System.out.println("-------------------");
//
//		Man man2 = new Boy();
//		man2.play();
//		man2.read();
	//	man2.eat(); obj of child but the refrence of parent thats why only parent prop will inherit 
		
		case4();
		case5();
		case6();
	}
	
	private static void case4()
	{
		playAtPark(new Man());
		playAtPark(new Boy());
		playAtPark(new Kid());
		playAtPark(new Infant());

	}
	
	private static void playAtPark(Man man) {
		man.play();
		
	}
	
	private static void case5()
	{
		Object obj ;
		
		obj =10;
		System.out.println(obj.getClass());
	}

		private static void case6()
		{
			typeCast(new Infant());
		}
	
//	private static void typeCast(Man man )
//	{
//		if(man instanceof Infant)
//		{
//			Infant infant = (Infant)man;
//			infant.sleep();
//		}
//	}
		
		
		private static void typeCast(Object obj )
		{
			if(obj instanceof Infant)
			{
				Infant infant = (Infant)obj;
				infant.sleep();
			}
		}
}
