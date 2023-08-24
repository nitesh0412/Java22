package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;

public class EmployeeTest {
	
	public static void main(String[] args) {
		 List<Employee> employees = Arrays.asList(
	                new Employee(1, "Nitesh", "HR", 50000),
	                new Employee(2, "depak", "developer", 60000),
	                new Employee(3, "anonymous", "IT", 75000),
	                new Employee(4, "asd", "HR", 55000),
	                new Employee(5, "bob", "developer", 62000),
	                new Employee(6, "temp", "csm", 48000)
	        );
		
//		Map<String,List<Employee>> collect  = employees.stream()
//				   .collect(Collectors.groupingBy(Employee::getDepartment));
//		collect.forEach((key,value)->{
//			System.out.println(key + value);
//		});
		
		 double  highest = employees.stream()
					.mapToDouble(Employee::getSalary) 
					.max()
					  .orElse(0.0);

				System.out.println(highest);
				
				
				  double count = employees.stream()
						.mapToDouble(Employee::getSalary) 
						 .count();
				 System.out.println(count);
				  
	}
	
	

}
