package com.kh.variable;

import java.util.Scanner;

public class KeyboardInput {
	// 개인정보 입력받기
	// Scanner클래스에 존재하는 메소드를 사용해서 입력
	public void inputInfo() {
		Scanner scanner = new Scanner(System.in); 
		//System.in 바이트 단위로 입력받는다
		System.out.println("25년 전통의 오리지널 메뉴");
		System.out.println("맛도 두 배 크기도 두 배");
		System.out.println("--------메뉴판---------");
		System.out.println("매운 페퍼로니 치즈돈까스");
		System.out.println("남산 왕돈까스");
		System.out.println("철판 함박 스테이크");
		System.out.println("======================");
		
		System.out.print("주문하실 메뉴를 입력해주세요 > ");
		//next() : 공백문자 이전까지만 입력받음
		String menu = scanner.next();
		System.out.println(menu + "을(를) 주문하셨습니다");
		
		System.out.print("몇 개 주문하시겠습니다?(숫자로 입력해주세요) > ");
		int count = scanner.nextInt();
		System.out.println(menu + "를 " + count + "개 주문하셨습니다");
		
		System.out.print("주소지를 입력해주세요 > ");
		scanner.nextLine();
		String address = scanner.nextLine();
		System.out.println(menu+ " " + count + "개를 " + address + "로 배달됩니다");
		
		
		
		/*String[] menu = {"매운 페퍼로니 치즈돈까스", "남산 왕돈까스", "철판 함박 스테이크"};
		String chooseString = scanner.nextLine();
		for(String food : menu) {
			if (food.equals(chooseString)) {
				System.out.println(food + " 주문완료");
			} else {
				System.out.println("메뉴가 없습니다");
			}
		}*/
	}

}
