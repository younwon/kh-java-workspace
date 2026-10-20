package com.kh.controller;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.run.MathRun;

public class StringController {
	String string = ""; //4Byte
	//참조자료형 => 주소값 => 주소값은 4Byte
	// String 클래스 => 불변
	
	public void method1() {
		String str1 = new String("hello");
		String str2 = new String("hello");
		MathRun run = new MathRun();
		
		System.out.println(run);
		System.out.println(str1);
		System.out.println(str2.toString());
		//String 클래스의 toString()의 경우 실제 담겨있는 문자열 값을 반환하게 오버라이딩
		
		MathRun run2 = new MathRun();
		System.out.println(run.equals(run2));
		System.out.println(str1.equals(str2));
		//equals()도 실제 담겨있는 문자열 값을 비교하게 오버라이딩
		
		// hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("hello".hashCode());
		// 실제 담긴 문자열값을 기반으로 해싱을 돌리도록 오버라이딩
		
		System.out.println(str1 == str2);
	}
	
	public void method2() {
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1 == str2);
	}
	
	public void method3() {
		String str1 = new String("hello"); //절대 금지 문법
		String str2 = "hello";
		
		// 문자열 리터럴은 대입연산자를 써서 대입할 때
		// String Pool(heap)영역에 등록됨
		// String Pool : 동일한 내용의 문자열이 존재할 수 없음
		// 동일한 내용의 경우 같은 곳을 가르킨다(얕은 복사)
		String str3 = str2;
		//String Pool에 "hello"를 찾고 있으면 그 주소를 대입
		
		System.out.println(str2);
		str2 += "~"; //새로운 String Pool에 hello~를 만든다
		System.out.println(str2);
	}
	
	//문자열 더하고싶은데 더하지말라고함(+의 경우 String Pool공간을 많이 잡아먹음)
	public void method4() {
		String string = "Hello" + "World"; //이거 금지
		StringBuffer sb = new StringBuffer();
		//문자열은 불변 객체기 때문에 내용물 변경이 일어나면 새로운 공간을 할당해서 메모리에 올림
		//이를 해결하기 위해 임시공간(Buffer)를 준비해서 임시공간에 차곡차곡 쌓다고 한번에 처리하는 클래스
		sb.append("Hello");
		sb.append(" world");
		System.out.println(sb);
		
		StringBuilder builder = new StringBuilder();
		builder.append("Hello");
		builder.append(" World");
		System.out.println(builder);
	}
	
	public void method5() {
		String str1 = "이 또한 지나가리";
		System.out.println("길이 : " + str1.length());
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 > ");
		String userIdString = scanner.nextLine();
		
		if (100 <= userIdString.length() && userIdString.length() <= 140) {
			throw new RuntimeException("아이디 글자수 에러");
		}
		
		char ch = str1.charAt(0);
		System.out.println(ch);
		System.out.println(str1.substring(5, 7));
		
		System.out.println(str1.indexOf('한'));
		
		String[] emailString = {"hong@naver.com", "kim@kh.com", "lee@@google.com"};
		for (String string : emailString) {
			System.out.println(string.substring(0, string.indexOf('@')));
		}
		
		String fileNameString = "flower.jpg";
		System.out.println(fileNameString.substring(fileNameString.indexOf('.')+1));
		
		String nameString = "sdf.ds.fd.d.sd.fd.e.fd.png";
		System.out.println(nameString.substring(nameString.lastIndexOf('.')+1));
		
		char[] chArr = str1.toCharArray();
		System.out.println(Arrays.toString(chArr));
		System.out.println(String.valueOf(chArr));
		
		String repalceString = "엄마손식당";
		System.out.println(repalceString.replace("엄마", "아빠"));
		
		System.out.println("abcd".toUpperCase());
		System.out.println("ABCD".toLowerCase());
		
		//분리하기
		String deviceString = "냉장고,세탁기,식기세척기,청소기";
		
		String[] deviceStrings = deviceString.split(",");
		for (String string : deviceStrings) {
			System.out.println(string);
		}
		
		System.out.println("-----------토큰뽑기------------");
		StringTokenizer stn = new StringTokenizer(deviceString, ",");
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		
		while (stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
	}
}
