package com.kh.chap04.model.dto;

public class gimbap {
	private String nameString;
	private String mainMenuString;
	private int price;
	public gimbap() {
		super();
	}
	public gimbap(String nameString, String mainMenuString, int price) {
		super();
		this.nameString = nameString;
		this.mainMenuString = mainMenuString;
		this.price = price;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getMainMenuString() {
		return mainMenuString;
	}
	public void setMainMenuString(String mainMenuString) {
		this.mainMenuString = mainMenuString;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
