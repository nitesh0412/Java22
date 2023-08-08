package com.aurionpro.test;

import org.omg.Messaging.SyncScopeHelper;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Rectangel;
import com.aurionpro.model.Shape;
import com.aurionpro.model.bordertype;
import com.aurionpro.model.colourtype;

public class TestShape {
	public static void main(String [] args) {
//			Shape shape = new Rectangel(colourtype.RED,bordertype.DOTTED,10,20);
//			double area = shape.calculatearea();
//			System.out.println(area);
//			
			Shape shape2 = new Circle(colourtype.RED,bordertype.DOTTED,10.1);
			System.out.println(shape2.calculatearea());
			
			Shape shape1 = new Rectangel(colourtype.RED,bordertype.DOTTED,10.1,10.1);
					System.out.println(shape1.calculatearea());
	}
}
