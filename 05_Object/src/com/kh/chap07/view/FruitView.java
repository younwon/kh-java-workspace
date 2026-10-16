package com.kh.chap07.view;

import java.util.Scanner;

import com.kh.chap07.controller.FruitController;
import com.kh.chap07.model.dto.Fruit;

public class FruitView { //화면의 입출력을 담당
	private Scanner scanner = new Scanner(System.in);
	private FruitController fc = new FruitController();
	
	public void mainMenu() {
		while (true) {
			System.out.println("과수원 관리 프로그램입니다.");
			System.out.println("1. 과일심기");
			System.out.println("2. 과일정보확인하기");
			System.out.println("3. 비료주기");
			System.out.println("4. 과일수확하기");
			System.out.println("5. 프로그램 종료");
			System.out.print("원하시는 메뉴를 선택하세요 > ");
			int menuNo = scanner.nextInt();
			scanner.nextLine();
			
			switch(menuNo) {
			case 1 : saveFruit(); break;
			case 2 : findFruit(); break;
			case 3 : fertilize(); break;
			case 4 : harvest(); break;
			case 5 : System.out.println("프로그램을 종료합니다"); return;
			default : System.out.println("메뉴에 없는 선택지 입니다");
			}
		}
	}
	
	private void saveFruit() {
		//과일이 이미 존재하는가
		//if (fc.findFruit() != null) {
		//	System.out.println("과일이 존재합니다");
		//	System.out.println("먼저 과일을 수확해주세요");
		//	return;
		//}
		
		System.out.print("과일명을 입력하시요 > ");
		String nameString = scanner.nextLine();
		System.out.print("품종을 입력하세요 > ");
		String specieString = scanner.nextLine();
		
		fc.saveFruit(nameString, specieString);
		System.out.println("저장되었습니다");
		System.out.println();
		
		//과일을 저장하고 관리하는 클래스는 service 패키지에 하자
	}
	
	private void findFruit() {
		Fruit[] fruits = fc.findFruit();
		//배열이 아닐때
		//if (fruit != null) {
		//	String info = fruit.info();
		//	System.out.println(info);
		//	System.out.println();
		//} else {
		//	System.out.println("아직 심은 과일이 없어요");
		//	System.out.println("과일을 먼저 심어보세요");
		//	System.out.println();
		//}
		
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i]!= null ) {
				System.out.println(fruits[i].info());
			}
		}
	}
	
	private void fertilize() {
		if (fc.findFruit() != null) {
			fc.fertilize();
			System.out.println("당도가 1 올랐습니다");
		} else {
			System.out.println("아직 심은 과일이 없어요");
			System.out.println("과일을 먼저 심어보세요");
		}
	}
	
	private void harvest() {
		if (fc.findFruit() != null) {
			System.out.println("정말 수확을 하고 싶으신가요???");
			findFruit();
			System.out.print("수확을 원하신다면 수확하기를 입력하세요");
			String answer = scanner.nextLine();
			if (answer.equals("수확하기")) {
				fc.harvest();
				System.out.println("수확성공");
			} else {
				System.out.println("메인메뉴로 돌아값니다");
			}
		}else {
			System.out.println("아직 심은 과일이 없어요");
			System.out.println("과일을 먼저 심어보세요");
		}
	}
	
	
}
