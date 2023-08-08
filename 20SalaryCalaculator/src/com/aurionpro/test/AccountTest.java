package com.aurionpro.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Accountant;
import com.aurionpro.model.Devloper;
import com.aurionpro.model.Employee;
import com.aurionpro.model.Manager;

public class AccountTest {

	public static void main(String[] args) {
		Employee Emp[] = { 
				new Manager(1, "Nitesh", 30000),
				new Devloper(2, "Dev", 25000),
				new Accountant(3, "Acc", 20000) };

	
	
	
	try {
		FileOutputStream file=new FileOutputStream("D:\\Serilaize.txt");
		ObjectOutputStream out=new ObjectOutputStream(file);
		
		out.writeObject(Emp);
		out.close();
		file.close();
		System.out.println("Serialization done..");
	} catch (Exception e) {
		e.printStackTrace();
	}

	}
	
}
//	public static void printsalaryslip(Employee Emp[]) {
//		for (int i = 0; i < Emp.length; i++) {
//			 double monthlySalary = Emp[i].calculateannualsalary();
//			 double annualSalary = Emp[i].calculateannualsalary();
//			 System.out.println(Emp.getClass().getName() + " Monthly Salary:" + monthlySalary);
//			 
//			 
//
//		}
	



//	public static void main(String[] args) {
//		Employee[] employees = { new Manager(1, "Yash", 50000), new Developer(2, "Akash", 40000),
//				new Accountant(3, "Prakash", 60000) };
//		System.out.println(employees);// for (Employee employee : employees) {
//		 double monthlySalary = employee.calculateMonthlySalary();//
//		 double annualCTC= employee.calculateAnnualCTC();
//		System.out.println(employee.getClass().getSimpleName() + " Monthly Salary:" + monthlySalary);
//		System.out.println(employee.getClass().getSimpleName() + " Annual CTC: " + annualCTC);// System.out.println();
//		 } }
//	}
//
//	public void printSalarySlip() {
//System.out.println("Salary Slip ");     
//System.out.println("Employee ID: " + id);
//System.out.println("Employee Name: " + name);  
//System.out.println("Basic Salary: $" + basic);
//System.out.println("Monthly Salary: $" + calculateannualsalary());   
//System.out.println("Annual CTC: $" + calculateAnnualCTC());
//System.out.println("-----------------------------------");        System.out.println();
//}
