package com.kh.chap03.model.dto;

public class Alcohol extends Beverage {
	private int alcoholContent;

	public Alcohol() {
		super();
	}

	public Alcohol(int alcoholContent) {
		super();
		this.alcoholContent = alcoholContent;
	}

	public Alcohol(String nameString, String volumeString, String colorString, int alcoholContent) {
		super(nameString, volumeString, colorString);
		this.alcoholContent = alcoholContent;
	}

	public int getAlcoholContent() {
		return alcoholContent;
	}

	public void setAlcoholContent(int alcoholContent) {
		this.alcoholContent = alcoholContent;
	}
	
	@Override
	public String info() {
		return super.info() + ", 알콜 함량 : " + alcoholContent;
	}

}
