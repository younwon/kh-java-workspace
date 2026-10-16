package com.kh.chap06.contoroller;

public class MethodController {
	
	public MethodController() {
	}
	
	//퓨어함수? 퓨어메소드?
	public int add(int a, int b) {
		return a + b;
	}
	
	//MetHod Overloading
	public void method() {
		System.out.println("메소드 오버로딩1");
	}
	public void method(int a) {
		System.out.println("메소드 오버로딩2");
	}
	
}
