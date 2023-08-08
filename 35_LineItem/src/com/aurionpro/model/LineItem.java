package com.aurionpro.model;

public class LineItem {

	private int id;
	private String name;
	private int quantity;
	private double unitPrice;
	private double totalcost;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LineItem(int id, String name, int quantity, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.totalcost = totalcost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getTotalcost() {
		return totalcost;
	}

	public void setTotalcost(double totalcost) {
		this.totalcost = totalcost;
	}

	public double calculateTotalPrice() {
		return (quantity * unitPrice);
	}
}
