package com.kh.diary.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.diary.controller.DiaryController;

// View는 지금 단계에서 어쩔수없음(View를 구현할 기술을 아직 안배움)
public class DiaryView {
	private Scanner scanner = new Scanner(System.in);
	private DiaryController dController = new DiaryController();
	
	public void mainMenu() {
		System.out.println("😊다이어리 꾸미기 프로그램에 오신것을 환영합니다😊"); //win + . 이모지 키
		while (true) {
			System.out.println("메뉴를 선택해주세요 :)");
			System.out.println("1. 다이어리 꾸미기 😁💕");
			System.out.println(" > ");
			int menuNo = 0;
			try {
				menuNo = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수를 입력하세요!!😡");
				continue;
			} finally {
				scanner.nextLine();
			}
		}
	}
}
