package com.aurionpro.model;

public class Rectangel  {
	private float height;
	private float width;

	public Rectangel(float height, float width) {
		super();
		this.height = height;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangel [height=" + height + ", width=" + width + "]";
	}

}
