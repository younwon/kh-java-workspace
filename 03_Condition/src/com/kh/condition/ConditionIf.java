package com.kh.condition;

import java.util.Scanner;

public class ConditionIf {
	/*
	 * if(조건식) { }
	 * 조건식의 결과값이 false면 if문 Scope를 건너뜀
	 * true면 Scope 안의 코드가 수행
	 */
	public void method0() {
		if (true) {
			System.out.println("나는 if문 이다");
		}
	}
	
	public void quiz() {
		int correct = 0;
		int wrong = 0;
		
		System.out.println("문제 : 토마토는 과일일까요?");
		Scanner scanner = new Scanner(System.in);
		System.out.println("정담을 o또는 x로 입력하세요 > ");
		char answer = scanner.nextLine().charAt(0);
		
		if (answer == 'x' || answer == 'X') {
			System.out.println("정답입니다!");
			correct++;
		}
		if (answer == 'o' || answer == 'O') {
			System.out.println("오답입니다!");
			wrong++;
		}
		if (answer != 'x' && answer != 'X' && answer != 'o' && answer != 'O') {
			System.out.println("O 또는 X를 입력하세요");
			wrong++;
		}
		
		System.out.println("문제 : 기린은 서서 잠을 잔다?");
		System.out.println("정담을 O/X로 입력해주세요 > ");
		answer = scanner.nextLine().charAt(0);
		
		if (answer == 'x' || answer == 'X') {
			System.out.println("오답!");
			wrong++;
		}
		if (answer == 'o' || answer == 'O') {
			System.out.println("정답!");
			correct++;
		}
		if (!(answer == 'x' || answer == 'X' || answer == 'o' ||  answer == 'O')) {
			System.out.println("O 또는 X를 입력하세요");
			wrong++;
		}
		
		System.out.println("퀴즈 끝~~~~~ 오늘의 결과!!");
		System.out.println("정답 : " + correct);
		System.out.println("오답 : " + wrong);

	}
	
}
