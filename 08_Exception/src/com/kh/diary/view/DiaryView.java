package com.kh.diary.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.diary.controller.DiaryController;
import com.kh.diary.dto.Diary;
import com.kh.diary.exception.DiaryBoomException;

// View는 지금 단계에서 어쩔수없음(View를 구현할 기술을 아직 안배움)
public class DiaryView {
	private Scanner scanner = new Scanner(System.in);
	private DiaryController dController = new DiaryController();
	
	public void mainMenu() {
		System.out.println("😊다이어리 꾸미기 프로그램에 오신것을 환영합니다😊"); //win + . 이모지 키
		while (true) {
			System.out.println("메뉴를 선택해주세요 :)");
			System.out.println("1. 다이어리 꾸미기 😁💕");
			System.out.println("2. 다이어리 작성하기 🤣👌");
			System.out.print(" > ");
			int menuNo = 0;
			try {
				menuNo = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수를 입력하세요!!😡");
				continue;
			} finally {
				scanner.nextLine();
			}
			
			switch (menuNo) {
			case 1 : decoDiary(); break;
			case 2 : writeDiary(); break;
			default: System.out.println("존내하지 않는 메뉴입니다😒‍");
			}
		}
	}
	
	private void decoDiary() {
		System.out.print("상단 로고를 입력하세요 > ");
		String logoString = scanner.nextLine();
		System.out.print("상단 타이틀을 입력하세요 > ");
		String titleString = scanner.nextLine();
		System.out.print("하단 서명을 입력하세요 > ");
		String signatureString = scanner.nextLine();
		
		dController.decoDiary(logoString, titleString, signatureString);
		
		System.out.println("다이어리 꾸미기 성공👏\n");
	}
	
	private void writeDiary() {
		System.out.println("내용을 작성해주세요 > ");
		String contentString = scanner.nextLine();
		//다이어리 작성시 10%활률로 다이어리가 폭팔할 수 있음
		try {
			dController.boom();
		} catch (DiaryBoomException e) {
			System.out.println("다이어리 대폭팔!!💥");
			System.out.println("새롭게 다이어리를 꾸며주세요😣");
			return;
		}
		
		System.out.println("\n\n\n\n");
		Diary diary = dController.getDiary();
		if (diary == null) {
			System.out.println("다이어리 꾸미기를 먼저 진행해주세요😑");
			return;
		}
		
		System.out.println(diary.getTitleString());
		System.out.println("\t" + diary.getLogoString());
		
		System.out.println("-----본문-----");
		System.out.println(contentString);
		System.out.println("\t\t" + diary.getSignatureString());
	}
}
