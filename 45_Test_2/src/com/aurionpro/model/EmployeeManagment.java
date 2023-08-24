package com.aurionpro.model;

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
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeManagment {

	List<Employee> employeeList = new ArrayList<Employee>();

	private static final String FILE_PATH = "employeedata.ser";

	public void creatObj() {

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
		serializeData();

		// Employee newEmployee = new Employee(12345, "John Doe", "Manager",
		// 9999,"15-AUG-23", 5000, 1000, 10);
		// employeeList.add(newEmployee);

	}

	private void serializeData() {
		try {
			FileOutputStream file = new FileOutputStream(FILE_PATH);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(employeeList);
			out.close();
			file.close();
			System.out.println("serialized");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		loadEmpData();
	}

	public void loadEmpData() {
		try {
			FileInputStream file = new FileInputStream(FILE_PATH);
			ObjectInputStream in = new ObjectInputStream(file);
			employeeList.addAll((List<Employee>) in.readObject());
			in.close();
			file.close();
			System.out.println("data loaded");
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println("Error loading employee data: " + ex.getMessage());
		}
	}

	public void listOfEmp() {
		System.out.println(employeeList.size());
		for (Employee employee : employeeList) {
			System.out.println(employee);

		}
	}

	public void addEmployee(Employee newEmployee) {
		employeeList.add(newEmployee);
		System.out.println("employee added");
		listOfEmp();
	}

	public void deleteEmployeeById(int empId) {
		employeeList.removeIf(employee -> employee.getEmpId() == empId);
		listOfEmp();
	}

	public void findEmployeeByDepart(int depart) {
		// Map<Integer, List<Employee>> findEmployeeByDepart = employeeList.stream()
		// .collect(Collectors.groupingBy(Employee :: getDepatId));
		for (Employee x : employeeList) {
			if (x.getDepatId() == depart) {
				System.out.println(x);
			}
		}

	}

	public void findEmployeeById(int empId) {

		for (Employee x : employeeList) {
			if (x.getEmpId() == empId) {
				System.out.println(x);
				break;
			}
		}
	}

	public void calculateTotalSalary() {
		int sum = 0;
		for (Employee x : employeeList) {
			sum = sum + x.getSalary();
		}
		System.out.println("sum:" + sum);
	}

	public void countOfEmployee() {
		// Map<Integer, List<Employee>> count =
		// employeeList.stream().collect(Collectors.groupingBy(Employee::getDepatId));
		System.out.println(
				employeeList.stream().collect(Collectors.groupingBy(Employee::getDepatId, Collectors.counting())));

	}

	// public void desigCount() {
	// System.out.println(employeeList.stream().collect(Collectors.counting()));
	// }

	public void highestForRole() {
		Map<String, Employee> highestForRole = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDesignation, Collectors.collectingAndThen(
						Collectors.reducing((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2), Optional::get)));

		System.out.println(highestForRole);
	}

	public void highestForDepart() {
		Map<Integer, Object> highestForDepart = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepatId, Collectors.collectingAndThen(
						Collectors.reducing((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2), Optional::get)));

		System.out.println(highestForDepart);
	}
	// public void countOfEmployee() {
	// Map<Integer, Long> departmentEmployeeCount = employeeList.stream()
	// .collect(Collectors.groupingBy(Employee::getDepatId, Collectors.counting()));
	//
	// for (Map.Entry<Integer, Long> entry : departmentEmployeeCount.entrySet()) {
	// System.out.println("Department " + entry.getKey() + ": " + entry.getValue() +
	// " employees");
	// }
	// }

	public void findmanger(int EmpId) {
		// boolean status = false;

		for (Employee x : employeeList) {
			if (EmpId == x.getEmpId())
				for (Employee y : employeeList) {
					if (x.getManagerID() == y.getEmpId()) {
						System.out.println(y);
					}

				}
			//
			// if (mngrId == x.getEmpId()) {
			// System.out.println(x);
			// }
		}
	}

	public void highestCommision() {
		Employee highest = null;
		for (Employee x : employeeList) {
			if (x.getDesignation().equals("SALESMAN")) {
				if (highest == null || x.getCommision() > highest.getCommision()) {
					highest = x;
				}

			}

		}
		System.out.println(highest);

	}

	// public void highestCommision2() {
	// 	Employee highest = null;
	// 	for (Employee x : employeeList) {
	// 		if ("SALESMAN".equals(x.getDesignation())) {
	// 			if (highest == null || x.getCommision() > highest.getCommision()) {
	// 				highest = x;
	// 			}
	// 		}
	// 	}

	// 	System.out.println(highest);

	// }

	public void findEmpJoinBetDates() {
		
		

	}

}
