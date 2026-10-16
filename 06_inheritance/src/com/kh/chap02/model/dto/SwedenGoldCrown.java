package com.kh.chap02.model.dto;

public class SwedenGoldCrown extends Treasure{
	private double purity;

	public SwedenGoldCrown() {
		super();
	}

	public SwedenGoldCrown(String name, double weight, double purity) {
		//setName(name);
		//setWeight(weight);
		//이렇게도 가능하구나
		super(name, weight);
		this.purity = purity;
	}

	public double getPurity() {
		return purity;
	}

	public void setPurity(double purity) {
		this.purity = purity;
	}
	
	public String info() {
		return super.info() + ", 순도 : " + purity + "]";
	}
	
}
