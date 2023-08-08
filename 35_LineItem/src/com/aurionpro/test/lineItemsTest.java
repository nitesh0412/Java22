package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.LineItem;

public class lineItemsTest {
	public static void main(String[] args) {
		ArrayList<LineItem> items = new ArrayList<>();

		items.add(new LineItem(1, "Product A", 5, 10.0));
		items.add(new LineItem(2, "Product B", 3, 8.5));
		items.add(new LineItem(3, "Product C", 2, 15.0));

		for (LineItem item : items) {
			System.out.println("Item ID: " + item.getId() + ", Name: " + item.getName() + ", Total Cost: $"
					+ item.calculateTotalPrice());
		}

	}
}
