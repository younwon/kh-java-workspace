package com.kh.chap01.abstraction.run;

import java.util.Scanner;

import com.kh.chap01.abstraction.model.vo.Charater;

public class MapleStory {

	public static void main(String[] args) {
		System.out.println("메이플 스토리 시작");
		
		Charater charater = new Charater();
		
		// 스캐너 타입의 변수 선언
		Scanner scanner = new Scanner(System.in);
		System.out.print("캐릭터의 닉네임을 입력해주세요 > ");
		charater.nameString = scanner.nextLine();
		System.out.print("캐릭터의 직업을 입력해주세요(전사, 도적, 마법사) > ");
		charater.jobString = scanner.nextLine();
		System.out.print("헤어스타일을 입력해주세요 > ");
		charater.hairStyleString = scanner.nextLine();
		
		while (true) {
			System.out.println();
			System.out.println(charater.nameString + "의 정보!");
			System.out.println("직업 : " + charater.jobString);
			System.out.println("헤어스티일 : " + charater.hairStyleString);
			System.out.println("레벨 : " + charater.level);
			
			System.out.println("메뉴를 선택해주세요 > ");
			System.out.print("1. 공격 / 2.점프 / 3. 프로그램 종료 > ");
			int menuNo = scanner.nextInt();
			scanner.nextLine();//버퍼 정리
			
			switch (menuNo) {
				case 1: charater.attack(); break;
				case 2: charater.jump(); break;
				case 3: return;
				default : System.out.println("메뉴에 없습니다");
			}
		}
	}

}
