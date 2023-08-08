package com.aurionpro.model;

import java.time.LocalDate;

public class Car extends vehicle implements IMovable {
	
	

	public Car(String brand, LocalDate dom) {
		super(brand, dom);
	}

	@Override
	public void move() {
	}

	@Override
	public void showTopSpeed() {
		// TODO Auto-generated method stub
	}

}
