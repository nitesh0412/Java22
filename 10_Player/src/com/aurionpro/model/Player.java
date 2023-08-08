package com.aurionpro.model;

public class Player {
	
	private String name ;
	private int age ;
	private CountryType country;
	private int runsscored;
	private int fifties;
	private int hundreads;
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", country=" + country + ", runsscored=" + runsscored
				+ ", fifties=" + fifties + ", hundreads=" + hundreads + "]";
	}


	public Player(String name, int age, CountryType country, int runsscored, int fifties, int hundreads) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
		this.runsscored = runsscored;
		this.fifties = fifties;
		this.hundreads = hundreads;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public CountryType getCountry() {
		return country;
	}
	public void setCountry(CountryType country) {
		this.country = country;
	}
	public int getRunsscored() {
		return runsscored;
	}
	public void setRunsscored(int runsscored) {
		this.runsscored = runsscored;
	}
	public int getFifties() {
		return fifties;
	}
	public void setFifties(int fifties) {
		this.fifties = fifties;
	}
	public int getHundreads() {
		return hundreads;
	}
	public void setHundreads(int hundreads) {
		this.hundreads = hundreads;
	}
	
	

}
