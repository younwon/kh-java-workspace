package com.kh.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.EnterFiveException;

public class UncheckException {
	public void divZero() {
		//System.out.println("실행은 됨");
		//System.out.println(10/0); ArithmeticException 발생
		//System.out.println("여기는 안됨");
		
		//ArithmeticException를 제어해보자
		//사용자에게 두개의 정수값을 입력받아서 나눗셈을 한 뒤 결과를 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요 > ");
		int num1 = scanner.nextInt();
		System.out.print("두 번째 정수를 입력하세요 > ");
		int num2 = scanner.nextInt();
		
		//예외 막기
		// if (num2 != 0) System.out.println(num1 / num2);
		// else System.out.println("0은 나누기 연산이 안됨");
		
		//예외 처리
		//try-catch문
		try {
			System.out.println(num1 / num2);
		} catch (ArithmeticException e) {
			System.out.println("두 번째 정수에 0을 입력할 수 없습니다");
		}
		
		scanner.close(); //자원반납(외부와 연결 끊기) =>개발자들끼리 약속
		System.out.println("메소드 호출 끝");
		
	}
	
	public void input() {
		//정수를 입력받고 싶은데=> 사용자가 실수 또는 문자열을 입력했다면
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 추가하기");
			System.out.println("2. 삭제하기");
			System.out.println("3. 종료하기");
			System.out.print("1번 또는 2번을 선택해주세요 > ");
			int menu = 0;
			try {
				menu = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수를 입력하세요");
			}
			scanner.nextLine();
			System.out.println(menu + "번을 선택했습니다");
		}
	}
	
	/*
	 * 프로그램 실행 시 발생하는 예외들이 있다(자바에서 만들어놓은 RuntimeException)
	 * RuntimeException은 runtime 예외들의 부모클래스
	 * 
	 * 개발자가 예측할수있고 예측해야함
	 */
	
	public int multiCatch() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오 > ");
		
		try {
			int num = scanner.nextInt();
			scanner.close();
			return (100/num);
		} catch (InputMismatchException e) {
			System.out.println("숫자값을 입력해");
			return 0;
		} catch (ArithmeticException e) {
			System.out.println("0으로는 못나눠");
			return 0;
		} finally { //리턴 직전에 무조건 finally블럭 부터 수행
			scanner.close();
		}
	}
	
	public void orderByCatch() {
		//실습 -> 정수를 입력받아 그 크기만큼의 배열을 생성 및 할당받고 이 배열의 100번째 인덱스에 대입되어있는 기본값을 출력하시오
		Scanner scanner = new Scanner(System.in);
		System.out.print("배열의 크기를 입력해주세요(100이상) > ");
		
		try {
			int num = scanner.nextInt(); //정수값이 아니면 에러(예외)
			int[] nums = new int[num]; //음수가 들어오면 에러(예외)
			System.out.println("100번째 인덱스의 값은 : " + nums[100]); //100번째 인덱스가 없으면 에러(예외)
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력하세요");
		} catch (NegativeArraySizeException e) {
			System.out.println("음수는 안됩니다");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("100이상의 정수를 입력하세요");
		} catch (RuntimeException e) { //내가 모르는 예외를 위해서
			System.out.println("에러");
		}
		scanner.close();
	}
	
	public void bomb() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오 > ");
		int num = scanner.nextInt();
		//예를 들어 절대로 5가 들어오면 안됨!!
		
		if (num == 5) {
			throw new EnterFiveException("사용자가 5를 입력함!!!");
		}
	}
}
