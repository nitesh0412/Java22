package com.aurionpro.test;

import com.aurionpro.model.Employee;
import com.aurionpro.model.EmployeeManagment;

public class EmployeeTest {
	
	
	public static void main(String[] args) {
			
//				System.out.println("welcome");
				
				EmployeeManagment emp = new EmployeeManagment();
				emp.creatObj();
//				emp.deleteEmployeeById(7566);
//				emp.listOfEmp();
//				Employee newEmployee = new Employee(1234, "Nitesh Kumawat", "Manager", 9999, "15-AUG-23", 5000, 1000, 10);
//				emp.addEmployee(newEmployee);
//				emp.deleteEmployeeById();
//				emp.calculateTotalSalary();
//				emp.findmanger(7902);
//				emp.highestCommision();
//				emp.countOfEmployee();
//				emp.countOfEmployee1();
//				emp.highestForDepart();
				emp.findEmployeeByDepart(20);
				
				
				
//				emp.addEmployee(employeeList, newEmployee);
//				System.out.println(findEmployeeById(employeeList, 7369));
//				 System.out.println(calculateTotalSalary(employeeList));
				// System.out.println(highestCommision(employeeList));
				//
				// Employee empMngr = findEmployeeById(employeeList, 7369);
				// System.out.println(findmanger(employeeList, empMngr.getManagerID()));
	}

}
