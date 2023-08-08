package com.aurionpro.model;

import java.time.LocalDate;

public class Bus extends vehicle implements IMovable {
	public Bus(String brand, LocalDate dom) {
		super(brand, dom);
	}

	@Override
	public void move() {
		System.out.println("bus is moving");
	}

	@Override
	public void showTopSpeed() {
		System.out.println("bus top speed is 100kmph");
	}
}