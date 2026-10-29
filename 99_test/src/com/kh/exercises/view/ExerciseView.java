package com.kh.exercises.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.exercises.controller.ExerciseController;

public class ExerciseView {
	Scanner scanner = new Scanner(System.in);
	private ExerciseController ec = new ExerciseController();
	
	public void mainMenu() {
		while (true) {
			System.out.println();
			System.out.println("운동 기록 관리 프로그램입니다");
			System.out.println("1. 운동 기록 전체 조회히가");
			System.out.println("2. 운동 기록 추가하기");
			System.out.println("3. 운동 기록 삭제하기");
			System.out.println("4. 부위 검색하기");
			System.out.println("5. 횟구 변경하기");
			System.out.println("6. 총 횟수");
			System.out.println("7. 기록 초기화");
			System.out.println("0. 프로그램 종료하기");
			System.out.println();
			System.out.print("사용하실 메뉴번호를 입력해주세요 > ");
			
			int menu = 0;
			try {
				menu = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				continue;
			} finally {
				scanner.nextLine();
			}
			
			switch (menu) {
			case 1 : break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			case 6 : break;
			case 7 : break;
			case 0 : System.out.println("프로그램을 종료합니다"); return;
			default: System.out.println("존재하지 않는 메뉴입니다");
			}
			
		}
	}
	
	private void readExercise() {
		
	}
	
	private void save() {
		
	}
	
	private void delete() {
		
	}
	
	private void findByTarget() {
		
	}
	
	private void updateReps() {
		
	}
	
	private void totalReps() {
		
	}
	
	private void clearHistory() {
	
	}

}
