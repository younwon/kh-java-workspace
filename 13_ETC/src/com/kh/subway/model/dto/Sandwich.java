package com.kh.subway.model.dto;

public class Sandwich {
	private String nameString;
	private int price;
	private String materialString;
	
	
	public Sandwich(String nameString, int price, String materialString) {
		super();
		this.nameString = nameString;
		this.price = price;
		this.materialString = materialString;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMaterialString() {
		return materialString;
	}
	public void setMaterialString(String materialString) {
		this.materialString = materialString;
	}
	@Override
	public String toString() {
		return "Sandwich [nameString=" + nameString + ", price=" + price + ", materialString=" + materialString + "]";
	}
	
	

}
