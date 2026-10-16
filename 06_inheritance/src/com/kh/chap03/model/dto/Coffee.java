package com.kh.chap03.model.dto;

public class Coffee extends Beverage {
	
	private int coffeineContent;

	public Coffee() {
		super();
	}

	public Coffee(int coffeineContent) {
		super();
		this.coffeineContent = coffeineContent;
	}

	public Coffee(String nameString, String volumeString, String colorString, int coffeineContent) {
		super(nameString, volumeString, colorString);
		this.coffeineContent = coffeineContent;
	}

	public int getCoffeineContent() {
		return coffeineContent;
	}

	public void setCoffeineContent(int coffeineContent) {
		this.coffeineContent = coffeineContent;
	}
	
	@Override
	public String info() {
		return super.info() + ", 카페인 함량 : " + coffeineContent;
	}
}
