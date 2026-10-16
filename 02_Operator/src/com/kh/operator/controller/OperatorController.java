package com.kh.operator.controller;

import java.util.Scanner;

public class OperatorController {
	
	public void arithmetic() {
		//산수연산자
		//+, -, *, /
		//% : 모듈러(Modular) => 나머지를 구하는 연산
		int firstNum = 10;
		int secondNum = 3;
		System.out.println("first : " + firstNum);
		System.out.println("second : " + secondNum);
		
		System.out.println("first + second : " + firstNum + secondNum);
		System.out.println("first + second : " + (firstNum + secondNum));
		
		int sum = firstNum + secondNum;
		System.out.println("first + second : " + sum);
		System.out.printf("first + second : %d", firstNum + secondNum);
		System.out.println();
		
		System.out.println("first - second : " + (firstNum - secondNum));
		System.out.println("first X second : " + (firstNum * secondNum));
		System.out.println("first / second : " + (firstNum / secondNum));
		System.out.println("first mod second : " + (firstNum % secondNum));
		
	}
	
	public void presentToStudent() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("고려은단 비타민씨를 받을 학생의 수 : ");
		int stuents = scanner.nextInt();
		System.out.print("비타민 개수 : ");
		int vitamin = scanner.nextInt();
		
		System.out.println("학생 수 : " + stuents + " 비타민 개수 : " + vitamin);
		
		System.out.println("1인당 받을 수 있는 비타민 개수 : " + (vitamin/stuents));
		System.out.println("남은 비타민 개수 : " + (vitamin%stuents));
	}
	
	
	public void increase() {
		/*
		 * 증강연산자 : 단항연산자로 한 번에 1 증가 또는 감소
		 * ++ 증가
		 * -- 감소
		 * 전위연산 / 후위연산으로 나눈다
		 */
		
		int num = 10;
		System.out.println(num);
		num++;
		System.out.println(num);
		num--;
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
	}
	
	public void compound() {
		//복합 대임 연산자
		long veryBigNumberCount = 100000000L;
		veryBigNumberCount += 1684;
		System.out.println(veryBigNumberCount);
		veryBigNumberCount -= 4567;
		System.out.println(veryBigNumberCount);
	}
	
	public void logicalNagation() {
		// 논리 부정 연산자 : 논리값을 반대로 바꿔주는 연산자
		System.out.println(true);
	}
	
	public void comparison() {
		/*
		 * 비교연산자
		 * 
		 * 두 개의 값을 가지고 비교하는 이항 연산자
		 * 비교연산을 한 결과 -> true, false
		 * 
		 * 동등 비교 : 일치함을 비교 
		 * a == b 일치합니까?
		 * a != b 일치하지 않습니까?
		 * 
		 * 대소비교
		 * a < b : a가 b보다 작습니까?
		 * a <= b : a가 b보다 작거나 같습니까?
		 */
		System.out.println(1 == 2);
		
		int firstNum = 10;
		int secondNum = 25;
		
		System.out.println(firstNum < secondNum);
		System.out.println(firstNum == secondNum);
		
		System.out.println("firstNumber가 짝수입니까?");
		
		System.out.println((firstNum%2) == 0);
	}
	
	public void logical() {
		/*
		 * 논리 연산자
		 * AND, OR
		 */
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);
		
		System.out.println(true || false);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scanner.nextInt();
		System.out.println(num > 0 && num%2 == 0);
		
		
	}
	
	public void andOper() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scanner.nextInt();
		System.out.println(num);
		System.out.println("입력한 값은 1 ~ 5 사이 입니까? : ");
		boolean check = num >= 1 && num <= 5;
		System.out.println(check);
	}
	
	public void orOper() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("한 글자 입력하세요 : ");
		char letter = scanner.nextLine().charAt(0);
		System.out.println(letter);
		boolean result = letter == 'a' || letter == 'A';
		System.out.print("입력한 값이 a 혹은 A 입니까? : ");
		System.out.println(result);
	}
	
	public void tip() {
		int num = 10;
		
		//AND에서 첫번째 비교가 false면 뒤에는 연산하지 않는다
		boolean result = false && (num > 0);
	}
	
	/*
	 * 삼항 연산자
	 * 3개의 값과 1개의 연산자로 구성됨(조건문의 형식으로 사용됨)
	 */
	public void triper() {
		//조건식 ? 조건식이 ture일 경우 : false일 경우
		System.out.println("영화루에 오신것을 환영합니다");
		System.out.println("1. 고추간짜장");
		System.out.println("2. 고추짬뽕");
		System.out.println("번호를 입력해주세요 > ");
		
		Scanner scanner = new Scanner(System.in);
		int menuNo = scanner.nextInt();
		
		String selected = menuNo == 1 ? "고추간짜장 주문" 
						: menuNo == 2 ? "고추짬뽕을 주문"
						: "없는 메뉴입니다";
		System.out.println(selected);
		
		
	}
	
}
