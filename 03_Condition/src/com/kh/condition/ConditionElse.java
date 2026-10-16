package com.kh.condition;

import java.util.Scanner;

public class ConditionElse {
	
	public void method1() {
		// ctrl + shift + o는 임포트 자동완성
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("핸드폰번호를 입려해보세요 > ");
		String phoneNumber = scanner.nextLine();
		System.out.println(phoneNumber == "010-7777-7777");
		//==의 경우 기본타입자료형 8개끼리만 가능
		System.out.println(phoneNumber.equals("010-7777-7777"));
		
		if (phoneNumber.equals("010-7777-7777")) {
			System.out.println("당첨입니다~~추카포카");
		} else {
			System.out.println("꽝!!!!!!");
		}
	}
	
	public void method2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("핸드폰번호를 입력하세요 >>> ");
		String phone = scanner.nextLine();
		System.out.println("사용자가 입력한 번호 : " + phone);
		String[] numbers = {"1234", "5678", "1111"};
		
		if (numbers[1].equals(phone)) {
			System.out.println("1등 당첨입니다!!!");
		} else if (numbers[2].equals(phone)) {
			System.out.println("2등 당첨입니다!!");
		} else if (numbers[3].equals(phone)) {
			System.out.println("3등 당첨입니다!");
		} else {
			System.out.println("다음기회에~~");
		}
	}
	
	public void ageCheck() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력하세요 >> ");
		int age = scanner.nextInt();
		
		/*
		 * if (1 <= age && age <= 12) { System.out.println("어린이 입니다"); } else if (13 <=
		 * age && age <= 17) { System.out.println("청소년 입니다"); } else if (18 <= age &&
		 * age <= 130) { System.out.println("성인입니다"); } else {
		 * System.out.println("잘못입력했습니다"); }
		 */
		
		//if는 이렇게 부정으로 사용하는것이 좋다
		if (age <= 0) {
			System.out.println("올바른 나이를 입력해");
		} else if (age >= 18) {
			System.out.println("성인입니다");
		} else if (age <= 12) {
			System.out.println("어린이입니다");
		} else {
			System.out.println("청소년입니다");
		}
		
	}
	
}
