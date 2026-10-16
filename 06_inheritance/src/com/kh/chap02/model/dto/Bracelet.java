package com.kh.chap02.model.dto;

public class Bracelet extends Treasure {
	private double perimeter;

	public Bracelet() {
		super();
	}

	public Bracelet(String name, double weight, double perimeter) {
		super(name, weight);
		this.perimeter = perimeter;
	}



	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	
}
