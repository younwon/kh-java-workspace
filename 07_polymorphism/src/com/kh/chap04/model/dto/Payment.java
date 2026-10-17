package com.kh.chap04.model.dto;

public interface Payment {


	int pay(int amount);

	//1. Payment 인터페이스를 구현하는 3개의 클래스
	// Card, Cash, Point, 만들기

	// 각각의 클래스는 잔액 필드를 가진다
	// 각각의 클래스는 pay를 전부 다르게 구현한다
	// main메서드에서는 Payment[]를 선언하고 세개의 클래스의 pay메서드를 반복문을 호출하여 결과를 확인한다
	
}
