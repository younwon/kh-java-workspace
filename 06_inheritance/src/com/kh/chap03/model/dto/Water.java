package com.kh.chap03.model.dto;

public class Water extends Beverage {
	private String waterSourceString;

	public Water() {
		super();
	}

	public Water(String waterSourceString) {
		super();
		this.waterSourceString = waterSourceString;
	}

	public Water(String nameString, String volumeString, String colorString, String waterSourceString) {
		super(nameString, volumeString, colorString);
		this.waterSourceString = waterSourceString;
	}

	public String getWaterSourceString() {
		return waterSourceString;
	}

	public void setWaterSourceString(String waterSourceString) {
		this.waterSourceString = waterSourceString;
	}
	
	
}
