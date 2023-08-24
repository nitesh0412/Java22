package com.aurionpro.test;

import java.util.List;
import java.time.LocalDate;
import java.util.Scanner;
import com.aurionpro.model.Employee;
import com.aurionpro.util.EmployeeUtil;

public class EmployeeTest {

	static int count = 0;

	public static void main(String[] args) {

		EmployeeUtil employeeUtil = new EmployeeUtil();
		// System.out.println(employeeUtil.getEmployeeList());
		// employeeUtil.addEmployee(new Employee(8010, "Rahul", "Manager", 3000, 7499,
		// 0, 30));
		// System.out.println("----------------");
		// System.out.println(employeeUtil.getEmployeeList());
		// System.out.println();
		// employeeUtil.findEmployeeById(7698);
		// employeeUtil.calculateTotalSalary();
		// employeeUtil.highestForRole();
		// employeeUtil.highestForDepart();
		// employeeUtil.findmanger(7788);
		// employeeUtil.highestCommision();
		// employeeUtil.countOfEmployee();
		// employeeUtil.findEmployeeByDepart(30);
		// employeeUtil.findEmployeesJoinedBetweenDates();
		System.out.println("Welcome to Employee Managment ....");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a option");
			System.out.println(
					"1: Find Employee by Id\n" + "2: List of all Employee\n" + "3: Find all Employee of department\n"
							+ "4: Find total salary of Employees\n" + "5: Find highest Commission from Salesman\n"
							+ "6: Find Manager of Employee\n" + "7: Add new Employee\n" + "8: Remove the Employee\n"
							+ "9: Find count of employees in each department\n"
							+ "10: Find highest paid employee in each department\n"
							+ "11: Find highest paid employee on each role\n"
							+ "12 Find the employee join between dates \n" + "13: Enter 0 for END");

			int option = sc.nextInt();
			try {
				if (option <= 12) {
					prog(option);
				}
				if (option == 0) {
					System.out.println("Prog End");
					return;
				}

			} catch (Exception e) {
				System.out.println("User input invalid");
			}

		}
	}

	public static void prog(int option) {
		EmployeeUtil employeeUtil = new EmployeeUtil();
		Scanner sc = new Scanner(System.in);

		switch (option) {
		case 1:
			System.out.println("Enter emp ID");
			int empId = sc.nextInt();
			employeeUtil.findEmployeeById(empId);
			break;

		case 2:
			System.out.println(employeeUtil.getEmployeeList());
			break;

		case 3:
			employeeUtil.findEmployeeByDepart(30);
			break;

		case 4:
			employeeUtil.calculateTotalSalary();
			break;

		case 5:
			employeeUtil.highestCommision();
			break;
		case 6:
			System.out.println("Enter emp ID");
			int EmpId = sc.nextInt();
			employeeUtil.findmanger(EmpId);
			break;

		case 7:
			System.out.println("Enter Details of emp");
			Employee newEmployee = new Employee(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextInt(),
					sc.nextDouble(), sc.nextInt());
			employeeUtil.addEmployee(newEmployee);

			employeeUtil.addEmployee(newEmployee);
			break;
		case 8:
			Employee employee = new Employee(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextInt(),
					sc.nextDouble(), sc.nextInt());
			employeeUtil.removeEmployee(employee);
			break;
		case 9:
			employeeUtil.countOfEmployee();
			break;
		case 10:
			employeeUtil.highestForDepart();
			break;
		case 11:
			employeeUtil.highestForRole();
			break;
		case 12:
			System.out.println("Enter start date (yyyy-MM-dd): ");
			LocalDate startDate = LocalDate.parse(sc.next());

			System.out.println("Enter end date (yyyy-MM-dd): ");
			LocalDate endDate = LocalDate.parse(sc.next());

			List<Employee> employeesBetweenDates = employeeUtil.findEmployeesJoinedBetweenDates(startDate, endDate);

			for (Employee employee1 : employeesBetweenDates) {
				System.out.println(employee1);
			}
			break;
		}

	}

}
