package com.kh.chap01;

public class Child1 extends Parent{
	private int y;
	
	public void printChild1() {
		System.out.println("첫번째 자식 클래스 메소드 호출");
	}
	
	@Override
	public void print() {
		System.out.println("첫번째 자식 오버라이딩");
	}
}
