package com.kh.variable;

public class Casting {
	/*
	 * Type Casting(자료형변환) : 자료형을 바꾸는 개념
	 * 
	 * 1. =(대입 연산자)를 기준으로 왼쪽 / 오른쪽 같은 자료형이어야 한다.
	 * => 같은 자료형에 해당하는 리터럴값만 대입할 수 있음
	 * => 자료형이 다를 경우 바꿔야함
	 * 
	 * 2. 같은 자료형들끼리만 연산이 가능함
	 * => 자료형이 다른데 연산하고 싶으면 둘 중 하나를 나머지 하나와 동일하게 맞춤
	 * 
	 * 3. 연산의 결과물도 동일한 자료형이어야 한다
	 * => 1 + 1 = 2(정수), 1.1 + 1.1 = 2.2(실수)
	 * 
	 */
	
	// Promotion 자동형변환
	public void autoCasting() {
		int intNum = 10;
		System.out.println(intNum);
		double doubleNum = intNum;
		System.out.println(doubleNum);
		System.out.println(intNum);
		
		intNum = (int)doubleNum;
		System.out.println(intNum);
		
		//예외상황 float형이 long형보다 표현할수있는 값이 더 많음
		long longNumber = 1000L;
		float floatNumber = longNumber;
		System.out.println(floatNumber);
		
		char ch = 'a';
		System.out.println(ch);
		int num = ch;
		System.out.println(num);
		char cNum = 98;
		System.out.println(cNum);
		
		System.out.println('a' + 3); //100
		
	}

}
