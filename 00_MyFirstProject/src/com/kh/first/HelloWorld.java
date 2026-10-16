package com.kh.first; //피키지 선언부 클래스 위치

/*
 * 주석(Comments)
 * 주석은 프로그램을 실행하는데 영향을 주지않는다
 * 작성한 코드를 쉽게 이해하기 위함
 * 우리는 학습의 용도로 사용
 * 
 * 패키지(Package)
 * 각각의 클래스들을 용도에 맞게 구분하여 패키지에 보관하는 것을 권장
 * 동일한 이름의 클래스는 존재할수없음
 * 
 * 권장사항
 * 기본적으로 세 단계 이상으로 만들것
 * com.(회사이름).(프로젝트이름/팀이름/카테고리이름/도메인이름)
 */

public class HelloWorld { // Scope(Block) { }는 복합문을 구성하는 요소 종속된 문장이 여러 줄 일때 { } 로 여닫는다
	public static void main(String[] args) { // 프로그램의 시작점(Entry Point), 프고르램당 1개는 있어야함
		System.out.println("HelloWorld");
		myFirstMethod();
	}

	public static void myFirstMethod() {
		System.out.println("안녕하세요");
	}

}
