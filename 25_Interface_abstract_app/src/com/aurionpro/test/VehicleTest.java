package com.aurionpro.test;

import java.time.LocalDate;
import com.aurionpro.model.Bike;
import com.aurionpro.model.Bus; 
import com.aurionpro.model.Car;
import com.aurionpro.model.IMovable;
import com.aurionpro.model.vehicle;

public class VehicleTest {
	public static void main(String[] args) {
		IMovable[] movables = new IMovable[3];
		movables[0] = new Car("Toyota", LocalDate.of(2022, 1, 1));
		movables[1] = new Bike("Honda", LocalDate.of(2021, 5, 10));
		movables[2] = new Bus("Volvo", LocalDate.of(2023, 3, 15));
		for (int i = 0; i < movables.length; i++) {
			startMoving(movables[i]);
			printDetails(movables[i]);
		}
	}

	public static void startMoving(IMovable movable) {
		movable.move();
	}

	public static void printDetails(IMovable movable) {
		if (movable instanceof vehicle) {
			vehicle vehicle = (vehicle) movable;
			System.out.println("Brand: " + vehicle.getBrand());
			System.out.println("Date of Manufacture: " + vehicle.getDom());
			System.out.println();
		}
	}
}
