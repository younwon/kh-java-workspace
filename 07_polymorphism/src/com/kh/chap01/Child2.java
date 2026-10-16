package com.kh.chap01;

public class Child2 extends Parent{
	private int z;
	
	public void printChild2() {
		System.out.println("두 번째 자식 클래스 메서드 호출");
	}
	
	@Override
	public void print() {
		System.out.println("두번째 자식 오버라이딩");
	}

}
