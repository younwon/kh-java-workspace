package com.kh.run;

public class WrapperRun {
	public static void main(String[] args) {
		//Wrapper Class
		//기본자료형을 참조자료형으로 포장해주는 클래스들
		/*
		 * Boolean
		 * Character
		 * Byte
		 * Short
		 * Integer
		 * Long
		 * Float
		 * Double
		 */
		//객체로 취급하고싶거나 다형성을 적용 또는 매개변수 자료형이 기본자료형을 못받는 경우
		
		Integer integer = new Integer(10);
		Integer integer2 = 10;
		Double double1 = 1.1;
		
		String str1 = "11";
		String str2 = "1.1";

		// 파싱(parsing) == 특정 데이터를 규칙에 따라서 분석하고 해석하는 과정
		int num = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		
		System.out.println(num + d);
		
		String str3 = d + "";
		String str4 = String.valueOf(num);
	}
}
