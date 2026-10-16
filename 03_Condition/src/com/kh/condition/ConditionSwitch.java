package com.kh.condition;

import java.util.Scanner;

public class ConditionSwitch {
	public void method0() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇 층 가세요?(B1 / B2 / B3) > ");
		String floorString = scanner.nextLine();
		
		//여러 동등비교를 할때 사용
		switch (floorString) {
		case "B1": System.out.println("지하 1층입니다"); break;
		case "B2": System.out.println("지하 2층입니다"); break;
		case "B3": System.out.println("지하 3층입니다");
		default:
			throw new IllegalArgumentException("Unexpected value: " + floorString);
		}
	}
	public void method1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("메뉴 번호를 입력하세요 > ");
		int menuNo = scanner.nextInt();
		
		//향산된 switch문
		int price = switch (menuNo){
		case 1, 4 -> 1000;
		case 2 -> 500;
		case 3 -> 4000;
		default -> 0;
		};
		System.out.println(menuNo + "번 메뉴는 " + price + "입니다");
	}
	public void method2() {
		int num = 1;
		//break가 없으면 밑에 다 실행됨
		switch (num) {
		case 1:System.out.println("1입니다");
		case 2:System.out.println("2입니다");
		default:System.out.println("없습니다");
		}
	}

}
