package com.kh.chap03.service;

public class EightZero extends BlackBeansSauceNoodles implements DeliveryService, Skill {

	@Override
	public void makeNoodles() {
		System.out.println("면은 기계면치고는 맛있는 짜장");

	}
	
	@Override
	public void delivery() {
		System.out.println("드론으로 배달합니다~");
	}

}
