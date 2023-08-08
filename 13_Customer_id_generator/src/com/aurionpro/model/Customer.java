package com.aurionpro.model;

public class Customer {
	private String id;
	private String name;
	private static int count = 1001;

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

	public Customer(String name) {
		this.id = generatedid();
		this.name = name;
	}
	
	private static String generatedid() {
		return "c" + (count*2);

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
