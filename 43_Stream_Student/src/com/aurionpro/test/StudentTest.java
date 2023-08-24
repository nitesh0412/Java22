package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		 List<Student> students = Arrays.asList(
		            new Student(1, "Nitesh", 90.9, Arrays.asList("Read", "Dance", "sing")),
		            new Student(2, "anoymous", 30.9, Arrays.asList("swim", "gym")),
		            new Student(3, "asd", 60.9, Arrays.asList("gym", "Dance", "swim")),
		            new Student(4, "Nit", 60.9, Arrays.asList("Read", "cooking"))
		            
		        );
		 
		   List<Double> percentage = students.stream()
				   .map((student) -> student.getPercentage())
				   .distinct()
				   
				   .collect(Collectors.toList());
		   System.out.println(percentage);
		
		   
//		   List<String> hobies = students.stream()
//				   .map((hobie) -> hobie.getHobies())
//				   .flatMap((list) -> list.stream())
//				   .distinct()
//				   .collect(Collectors.toList());
//		   System.out.println(hobies);

	}

}
