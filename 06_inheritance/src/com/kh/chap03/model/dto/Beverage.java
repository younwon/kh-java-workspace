package com.kh.chap03.model.dto;

public class Beverage {
	private String nameString;
	private String volumeString;
	private String colorString;
	
	public Beverage() {
		super();
	}

	public Beverage(String nameString, String volumeString, String colorString) {
		super();
		this.nameString = nameString;
		this.volumeString = volumeString;
		this.colorString = colorString;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getVolumeString() {
		return volumeString;
	}

	public void setVolumeString(String volumeString) {
		this.volumeString = volumeString;
	}

	public String getColorString() {
		return colorString;
	}

	public void setColorString(String colorString) {
		this.colorString = colorString;
	}
	
	public String info() {
		return "음료의 정보 : " + nameString + ", 용량 : " + volumeString + ", 색깔 : " + colorString;
	}
	
	@Override
	public String toString() {
		return "음료의 정보 : " + nameString + ", 용량 : " + volumeString + ", 색깔 : " + colorString;
	}
	
	/*
	 * 오버라이딩
	 * 
	 * 부모클래스의 메소드를 재정의하는것
	 * 자식클래스에 존재하는 메소드테이블에 새로운 내용으로 덮어씀
	 * 
	 * 성립조건
	 * 1. 메소드명이 동일
	 * 2. 매개변수가 동일함
	 * 3. 반환형이 동일해야함
	 * 4. 부모메서드의 접근제한자보다 공유범위가 같거나 넓어야함
	 * 
	 * --개발자들끼리의 암묵적인 약속 : 오버라이딩한 메소드는 반드시 @Override를 붙여주자
	 * 
	 * @Annotation
	 * 1. 실수를 줄일 수 있음
	 * 2. 누가봐도 오버라이딩한 메소드다
	 */
}
