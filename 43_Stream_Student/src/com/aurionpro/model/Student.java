package com.aurionpro.model;

import java.util.List;

public class Student {

	private int id;
	private String name;
	private double percentage;
	
	public Student(int id, String name, double percentage, List<String> hobies) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.hobies = hobies;
	}

	private List<String> hobies;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public List<String> getHobies() {
		return hobies;
	}

	public void setHobies(List<String> hobies) {
		this.hobies = hobies;
	}

}
