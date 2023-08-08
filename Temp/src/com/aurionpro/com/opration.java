package com.aurionpro.com;

public class opration {
	public  int id;
	private String name;
	int age;
	boolean eligibale;

	public opration(int xyz, String name, int age, boolean eligibale) {
		super();
		this.id = xyz;
		this.name = name;
		this.age = age;
		this.eligibale = eligibale;
	}
	
	public int  multi()
	{	return id*2;
		 
	}

	public int getId() {
		return id;
	}

	public void setId(int xyz) {
		this.id = xyz;
	}

	public int sum() {

		return id * 8000;
	}

	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", age=" + age + ", eligibale=" + eligibale + "]";
	}

}
