package com.kh.chap04.view;

import com.kh.chap04.controller.FieldController;

public class FeldView {
	public void check() {
		FieldController fController = new FieldController(); //객체 생성
		System.out.println(fController.global); //멤버변수는 접근 가능
		
		fController.checkVariable(10); // 메서드 호출 -> 매개변수 초기화 -> local변수 메모리 할당
		
		fController = null;
		
		System.out.println(fController.string);
	}
}
