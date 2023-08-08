package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.aurionpro.model.Student;

public class studentTest {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>(); 
		students.add(new Student(1, "Nitesh", 90)); 
		students.add(new Student(2, "temp", 56)); 
		students.add(new Student(3, "Yash", 89)); 
		students.add(new Student(4, "akash", 76)); 
		
		Collections.sort(students, new Comparator<Student>() { 
			@Override 
			public int compare(Student student1, Student student2) { 
				return student1.getName().compareTo(student2.getName());
			} 
		});
		
		System.out.println("Sorted StudentS");
		for (Student student : students) {
			System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Percentage: " + student.getPercentage());
		}
	}
}
