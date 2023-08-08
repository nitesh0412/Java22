package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.ColourType;
import com.aurionpro.model.Rectangel;
public class Rectangle_test {
 public static void main(String[] args){
  

	 Rectangel obj= new Rectangel();
  printAreaAndPerimeter(obj);
  Rectangel obj1= new Rectangel(10,20);
  printAreaAndPerimeter(obj1);

  Rectangel obj2= new Rectangel(19,20,ColourType.valueOf("BLUE"));
  printAreaAndPerimeter(obj2);

    
 
  
  System.out.println("-------");
  
  
//  Rectangle rectangle2 = new Rectangle();
//  getUserInputForHeightandWidth(rectangle2);
//  printAreaAndPerimeter(rectangle2);
  
  
  
 
 }
 
 
 
 
 
 
 private static void getUserInputForHeightandWidth(Rectangel rectangle) {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the height and width of the recatngle");
  rectangle.setHeight( sc.nextDouble());
  System.out.println("enter the width of the recatngle");
  rectangle.setWidth( sc.nextDouble());
  System.out.println("enter the Colour of the recatngle");
  try {
  rectangle.setColour(ColourType.valueOf(sc.next().toUpperCase()));
  }
  catch (IllegalArgumentException e) {
   rectangle.setColour(ColourType.RED);
  }
  
  
 }
 private static void printAreaAndPerimeter(Rectangel rectangle) {
  System.out.println("Hight of rectangle:"+rectangle.getHeight());
  System.out.println("Width of rectangle:"+rectangle.getHeight());
  System.out.println("Colour of rectangle:"+rectangle.getColour());
  
  System.out.println("area of rectangle:"+rectangle.areaofRectangle());
  System.out.println("perimeter:"+rectangle.perimeterOfRectangle());
 
 
 
 }
 
}
