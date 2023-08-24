package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	private static final String FILE_PATH = "employeedata.ser";

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\nitesh.kumawat\\Downloads\\emp.txt"))) {
			String line = br.readLine();
			while (line != null) {
				String[] parts = line.split(",");
				if (parts.length == 8) {
					int empId = Integer.parseInt(parts[0]);
					String name = parts[1].replaceAll("'", "");
					String designation = parts[2].replaceAll("'", "");
					int managerID = "NULL".equals(parts[3]) ? -1 : Integer.parseInt(parts[3]);
					String doj = parts[4].replaceAll("'", "");
					int salary = Integer.parseInt(parts[5]);
					int commision = "NULL".equals(parts[6]) ? -1 : Integer.parseInt(parts[6]);
					int depatId = Integer.parseInt(parts[7]);

					Employee employee = new Employee(empId, name, designation, managerID, doj, salary, commision,
							depatId);
					employeeList.add(employee);
				}
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		Employee newEmployee = new Employee(12345, "John Doe", "Manager", 9999, "15-AUG-23", 5000, 1000, 10);
		employeeList.add(newEmployee);

		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
		serializeData(employeeList);

		System.out.println(findEmployeeById(employeeList, 7369));
		System.out.println(calculateTotalSalary(employeeList));
		System.out.println(highestCommision(employeeList));

		Employee empMngr = findEmployeeById(employeeList, 7369);
		System.out.println(findmanger(employeeList, empMngr.getManagerID()));

	}

	public static void serializeData(List<Employee> employeeList) {
		try {
			FileOutputStream file = new FileOutputStream(FILE_PATH);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(employeeList);
			out.close();
			file.close();
			System.out.println("Employee data has been serialized");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		loadEmpData(employeeList);
	}

	public static void loadEmpData(List<Employee> employeeList) {
		try {
			FileInputStream file = new FileInputStream(FILE_PATH);
			ObjectInputStream in = new ObjectInputStream(file);
			employeeList.addAll((List<Employee>) in.readObject());
			in.close();
			file.close();
			System.out.println("Employee data has been loaded");
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println("Error loading employee data: " + ex.getMessage());
		}
	}

	public static void addEmployee(List<Employee> employeeList, Employee newEmployee) {
		employeeList.add(newEmployee);
	}

	public static void deleteEmployeeById(List<Employee> employeeList, int empId) {
		employeeList.removeIf(employee -> employee.getEmpId() == empId);
	}

	public static Employee findEmployeeById(List<Employee> employeeList, int empId) {
		for (Employee x : employeeList) {
			if (x.getEmpId() == empId) {
				return x;
			}
		}
		return null;
	}

	public static int calculateTotalSalary(List<Employee> employeeList) {
		int sum = 0;
		for (Employee x : employeeList) {
			sum = sum + x.getSalary();
		}
		return sum;
	}

	public static int countOfEmployee(List<Employee> employeeList) {
		Map<Integer, List<Employee>> count = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepatId));

		return 0;

	}

	public static Employee findmanger(List<Employee> employeeList, int managerId) {
		for (Employee x : employeeList) {
			if (managerId == x.getEmpId()) {
				return x;
			}
		}
		return null;
	}

	public static Employee highestCommision(List<Employee> employeeList) {
		Employee highest = employeeList.get(0);
		for (Employee x : employeeList) {
			if (highest.getCommision() < x.getCommision() || highest == null) {
				highest = x;
			}
		}
		return highest;
	}
}
