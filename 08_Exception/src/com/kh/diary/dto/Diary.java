package com.kh.diary.dto;

public class Diary {
	private String logoString;
	private String titleString;
	private String signatureString;
	
	public Diary() {
		super();
	}
	public Diary(String logoString, String titleString, String signatureString) {
		super();
		this.logoString = logoString;
		this.titleString = titleString;
		this.signatureString = signatureString;
	}
	public String getLogoString() {
		return logoString;
	}
	public void setLogoString(String logoString) {
		this.logoString = logoString;
	}
	public String getTitleString() {
		return titleString;
	}
	public void setTitleString(String titleString) {
		this.titleString = titleString;
	}
	public String getSignatureString() {
		return signatureString;
	}
	public void setSignatureString(String signatureString) {
		this.signatureString = signatureString;
	}
	
	
}
