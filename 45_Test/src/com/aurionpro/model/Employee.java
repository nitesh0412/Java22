package com.aurionpro.model;

import java.io.Serializable;

public class Employee implements Serializable {

	private int empId;
	private String name;
	private String designation;
	private int managerID;
	private String doj;
	private int salary;
	private int commision;
	private int depatId;

	public Employee(int empId, String name, String designation, int managerID, String doj, int salary, int commision,
			int depatId) {
		super();
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.managerID = managerID;
		this.doj = doj;
		this.salary = salary;
		this.commision = commision;
		this.depatId = depatId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommision() {
		return commision;
	}

	public void setCommision(int commision) {
		this.commision = commision;
	}

	public int getDepatId() {
		return depatId;
	}

	public void setDepatId(int depatId) {
		this.depatId = depatId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", designation=" + designation + ", managerID="
				+ managerID + ", doj=" + doj + ", salary=" + salary + ", commision=" + commision + ", depatId="
				+ depatId + "]";
	}

}
