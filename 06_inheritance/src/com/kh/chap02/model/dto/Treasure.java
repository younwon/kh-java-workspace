package com.kh.chap02.model.dto;
/**
 * 상송(inheritance)
 * 기존에 존재하는 클래스를 이용해서 새로운 클래스르 만드는 기술
 */

public class Treasure {
	// 공통필드
	private String name;
	private double weight;
	
	public Treasure() {
		super();
		System.out.println("나는 부모");
	}

	public Treasure(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
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
	
	public String info() {
		return "보물정보 = [보물명 : " + name + ", 무게 : " + weight;
	}
	
	
}
