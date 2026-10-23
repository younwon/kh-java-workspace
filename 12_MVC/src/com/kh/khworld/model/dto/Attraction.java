package com.kh.khworld.model.dto;

public class Attraction {
	private String name;
	private String heightLimit;
	private String lacation;
	
	public Attraction(String naem, String heightLimit, String lacation) {
		super();
		this.name = naem;
		this.heightLimit = heightLimit;
		this.lacation = lacation;
	}

	public String getName() {
		return name;
	}

	public void setNaem(String naem) {
		this.name = naem;
	}

	public String getHeightLimit() {
		return heightLimit;
	}

	public void setHeightLimit(String heightLimit) {
		this.heightLimit = heightLimit;
	}

	public String getLacation() {
		return lacation;
	}

	public void setLacation(String lacation) {
		this.lacation = lacation;
	}

	@Override
	public String toString() {
		return "Attraction [name=" + name + ", heightLimit=" + heightLimit + ", lacation=" + lacation + "]";
	}
	
	
}
