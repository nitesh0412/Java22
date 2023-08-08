package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.aurionpro.model.Employee;

public class EmployeeDeSerializeTest {

	public static void main(String[] args) {

		try {
			FileInputStream file = new FileInputStream("D:\\Serilaize.txt");
			ObjectInputStream out = new ObjectInputStream(file);

			Employee[] employees = (Employee[]) out.readObject();
			for (Employee e : employees) {
				printSalarySlip(e);
				System.out.println("=====================================");
			}

			out.close();
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void printSalarySlip(Employee e) {
		System.out.println(e);
		System.out.println("Monthly Salary : " +e.calculatemonthlysalary());
		System.out.println("Annual CTC : " +e.calculateannualsalary());
	}

}
