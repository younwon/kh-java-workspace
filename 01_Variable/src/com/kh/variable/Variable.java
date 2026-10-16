package com.kh.variable;

public class Variable {
	
	//변수 : RAM에 값을 저장하기 위한 공간
	public void printNumber() {
		boolean isTrue;
		isTrue = true;
		System.out.println(isTrue);
		//초기화(Initialized)를 하지 않으면 안된다
		isTrue = false; // 대입
		System.out.println(isTrue);
		
		//정수 자료 형 byte, short, int, long
		//int형을 기본으로 사용, long형은 숫자뒤에 "L"을 붙임
		byte byteNum = 1; //1Byte
		short shortNum = 2; //2Byte
		int intNum = 3; //4Byte
		long longNum = 4L; //8Byte
		
		System.out.println(byteNum);
		System.out.println(shortNum);
		System.out.println(intNum);
		System.out.println(longNum);
		
		//실수형
		//float(숫자 뒤에 F를 붙인다), double(기본)
		float floatNum = 1.1F; //4Byte
		double doubleNum = 2.2; //8Byte
		System.out.println(floatNum);
		System.out.println(doubleNum);
		
		//단일문자형
		char gold = '금'; //2Byte 
		//앞뒤로 홀따옴표를 붙여준다
		System.out.println(gold);
		
		//-------여기까지 기본자료형
		
		//문자열
		String fruit = "apple"; //앞 뒤로 쌍따옴표를 붙인다
		System.out.println(fruit);
		
		String source = "출력값 : ";
		System.out.println(source + intNum);
		
		//상수
		final int START_YEAR = 1998;
	}

}
