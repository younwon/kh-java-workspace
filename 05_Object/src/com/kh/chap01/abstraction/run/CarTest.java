package com.kh.chap01.abstraction.run;

import java.util.Scanner;

import com.kh.chap01.abstraction.model.vo.Car;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("주행시작");
		
		Scanner scanner = new Scanner(System.in);
		Car car = new Car();
		System.out.print("차 이름을 입력하세요 > ");
		car.nameString = scanner.nextLine();
		System.out.print("차 종을 입력하세요(현대, 기아) > ");
		car.modelString = scanner.nextLine();
		System.out.print("차 색상을 선택하세요(빨강, 검정, 파랑) > ");
		car.colorString = scanner.nextLine();
		
		while (true) {
			System.out.println();
			System.out.println(car.nameString + "의 정보");
			System.out.println("차 종 : " + car.modelString);
			System.out.println("차 색상 : " + car.colorString);
			System.out.println("주행 거리 " + car.mileage + "KM");
			
			System.out.println("메뉴를 선택해주세요 > ");
			System.out.print("1. 멈추기 / 2. 가기 / 3. 도색 / 4. 프로그램 종료 > ");
			int menuNo = scanner.nextInt();
			scanner.nextLine();//버퍼 정리
			
			switch (menuNo) {
				case 1: car.stop(); break;
				case 2: car.drive(); break;
				case 3: car.recolor(); break;
				case 4: return;
				default: System.out.println("메뉴에 없습니다");
			}
		}

	}

}
