package com.aurionpro.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;

public class EmployeeUtil {

	List<Employee> employeeList;
	private static boolean initialLoad = false;

	public EmployeeUtil() {
		this.employeeList = new ArrayList<>();
		loadEmployee();

	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	@SuppressWarnings("unchecked")
	private void loadEmployee() {
		if (checkIfFileEmpty() && !initialLoad) {
			employeeList = new EmployeeReader().readEmployeeFromFile("C:\\Users\\nitesh.kumawat\\Downloads\\emp.txt");
			initialLoad = true;
		} else if (!checkIfFileEmpty()) {
			try {
				FileInputStream file = new FileInputStream("D:\\test\\emp-serialize.txt");
				ObjectInputStream in = new ObjectInputStream(file);

				this.employeeList = (List<Employee>) in.readObject();

				in.close();
				file.close();

				// System.out.println("Object de-serialized successfully");

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void addEmployee(Employee employee) {
		employeeList.add(employee);
		saveEmployeeList();
	}

	public void removeEmployee(Employee employee) {
		if (employeeList.contains(employee)) {
			employeeList.remove(employee);
			saveEmployeeList();
		}

	}

	public void findEmployeeById(int empId) {

		for (Employee x : employeeList) {
			if (x.getId() == empId) {
				System.out.println(x);
				break;
			}
		}
	}

	public void calculateTotalSalary() {
		double sum = 0;
		for (Employee x : employeeList) {
			sum = sum + x.getSalary();
		}
		System.out.println("sum:" + sum);
	}

	public void highestForRole() {
		Map<String, Employee> highestForRole = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getRole, Collectors.collectingAndThen(
						Collectors.reducing((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2), Optional::get)));

		System.out.println(highestForRole);
	}

	public void highestForDepart() {
		Map<Integer, Object> highestForDepart = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors.collectingAndThen(
						Collectors.reducing((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2), Optional::get)));

		System.out.println(highestForDepart);
	}

	public void findEmployeeByDepart(int depart) {
		// Map<Integer, List<Employee>> findEmployeeByDepart = employeeList.stream()
		// .collect(Collectors.groupingBy(Employee :: getDepatId));
		for (Employee x : employeeList) {
			if (x.getDepartmentId() == depart) {
				System.out.println(x);
			}
		}

	}

	public void findmanger(int EmpId) {
		// boolean status = false;

		for (Employee x : employeeList) {
			if (EmpId == x.getId())
				for (Employee y : employeeList) {
					if (x.getManagerId() == y.getId()) {
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
			if (x.getRole().equals("SALESMAN")) {
				if (highest == null || x.getCommission() > highest.getCommission()) {
					highest = x;
				}

			}

		}
		System.out.println(highest);

	}

	public void countOfEmployee() {
		// Map<Integer, List<Employee>> count =
		// employeeList.stream().collect(Collectors.groupingBy(Employee::getDepatId));
		System.out.println(
				employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors.counting())));

	}
	
	 public List<Employee> findEmployeesJoinedBetweenDates(LocalDate startDate, LocalDate endDate) {
	        List<Employee> employeesJoinedBetweenDates = new ArrayList<>();

	        for (Employee employee : employeeList) {
	            LocalDate joinDate = employee.getDateOfJoining(); 
	            if (!joinDate.isBefore(startDate) && !joinDate.isAfter(endDate)) {
	                employeesJoinedBetweenDates.add(employee);
	            }
	        }

	        return employeesJoinedBetweenDates;
	    }

	private void saveEmployeeList() {
		try {
			FileOutputStream file = new FileOutputStream("D:\\test\\emp-serialize.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(employeeList);

			out.close();
			file.close();

			// System.out.println("Object serialized successfully");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private boolean checkIfFileEmpty() {
		try {
			FileInputStream file = new FileInputStream("D:\\test\\emp-serialize.txt");
			if (file.read() != -1) {
				return false;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

}
