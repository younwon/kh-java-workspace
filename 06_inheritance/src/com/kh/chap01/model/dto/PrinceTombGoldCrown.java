package com.kh.chap01.model.dto;

public class PrinceTombGoldCrown {
	private String name;
	private double weight;
	private String source;
	
	public PrinceTombGoldCrown() {
		super();
	}
	
	public PrinceTombGoldCrown(String name, double weight, String source) {
		super();
		this.name = name;
		this.weight = weight;
		this.source = source;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}
	
	public String info() {
		return " 보물정보 = [보물명 : " + name + ", 무게 : " + weight + ", 출처 : " + source + "]";
	}
}
