package com.kh.chap04.controller;

// 필드 == 멤버변수 == 속성
/*
 * 인스턴스 변수
 * 
 * new 키워드를 사용해서 객체를 생성하는 순간 heap에 할당
 * 
 * 클래스 변수
 * 
 * static 예약어가 붙어있는 필드
 * 
 * 지역변수
 * scope 내부에서 선언되는 시점에 메모리 영역에 할당
 * 
 */
public class FieldController {
	public int global;
	public static String string = "나는 스태틱";
	// 프로그램 구동 중 계속 값을 사용해야하는 경우에만 사용
	public static final String JAVA_VERSTION = "21"; //fianl이랑 같이 많이 사용됨
	
	public void checkVariable(int parameter) {
		int local = 1;
		
		System.out.println(global);
		System.out.println(local);
		System.out.println(parameter);
	}
}
