package com.kh.chap02.model.dto;

public class Mall {
	private String brandString;
	private String addressString;
	
	public Mall(String brandString, String addressString) {
		super();
		this.brandString = brandString;
		this.addressString = addressString;
	}

	public String getBrandString() {
		return brandString;
	}

	public void setBrandString(String brandString) {
		this.brandString = brandString;
	}

	public String getAddressString() {
		return addressString;
	}

	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}

	@Override
	public String toString() {
		return "Mall [brandString=" + brandString + ", addressString=" + addressString + "]";
	}
	
	
}
