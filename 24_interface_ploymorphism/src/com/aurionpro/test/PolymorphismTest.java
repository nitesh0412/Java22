package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotional;
import com.aurionpro.model.Imannerable;
import com.aurionpro.model.Man;

public class PolymorphismTest {
	
	Man man = new Man();
	Boy boy = new Boy();
	
	attheparty(man);
	
		
	
	
	
}
	
		public static void atthemovie(IEmotional obj) {
		obj.laugh();
		obj.cry();
	}

		public static void attheparty(Imannerable obj)
		{
			obj.WelcomeGreet();
			obj.DepartGreet();
		}
		
	}
