package com.kh.chap02.model.dto;

public abstract class Cook {
	private String nameString;

	public Cook(String nameString) {
		super();
		this.nameString = nameString;
	}
	
	//public void cooking() {} 이 메소드는 자식클래스들이 오버라이딩 하기 위해서 선언
	
	// 추상화 => 추상메소드
	// abstract <=> implement
	
	// static / dynamic / automatic
	// virtual ==  logical / physical
	
	public abstract void cooking();
	
	public void breakTime() {
		System.out.println("쉬는 시간입니다~~~");
	}
}
