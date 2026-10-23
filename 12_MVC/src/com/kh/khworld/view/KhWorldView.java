package com.kh.khworld.view;

import java.net.Socket;
import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.khworld.controller.KhWorldController;
import com.kh.khworld.exception.DuplicateNameException;
import com.kh.khworld.model.dto.Attraction;

public class KhWorldView {
	private Scanner scanner = new Scanner(System.in);
	private KhWorldController kwc = new KhWorldController();
	
	// 프로그램 실행 시 첫 화면
	public void mainMenu() {
		while (true) {
			System.out.println();
			System.out.println("놀이기구 관리 프로그램입니다");
			System.out.println("1. 놀이기구 전체 조회하기");
			System.out.println("2. 놀이기구 추가하기");
			System.out.println("3. 놀이기구 삭제하기");
			System.out.println("4. 놀이기구 검색하기");
			System.out.println("0. 프로그램 종료하기");
			System.out.println();
			System.out.print("메뉴를 선택하세요 > ");
			int menu = 0;
			
			try {
				menu = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력해주세요");
				continue;
			} finally {
				scanner.nextLine(); //버퍼정리
			}
			
			switch (menu) {
			case 1 : readAttractions(); break;
			case 2 : save(); break;
			case 3 : deleteAttraction(); break;
			case 4 : findByName(); break;
			case 0 : System.out.println("프로그램을 종료합니다"); scanner.close(); return;
			default : throw new IllegalArgumentException("Unexpected value: " + menu);
			}
		}
	}
	
	private void readAttractions() {
		List<Attraction> list = kwc.readAttractions();
		
		if (!list.isEmpty()) {
			System.out.println();
			System.out.println("놀이기구의 정보를 확인하세요");
			System.out.println();
			for (Attraction attraction : list) {
				System.out.println("놀이기구명 : " + attraction.getName());
				System.out.println("--------------------------------------------");
				System.out.println("키 제한 : " + attraction.getHeightLimit());
				System.out.println("--------------------------------------------");
				System.out.println("위치 : " + attraction.getLacation());
				System.out.println("--------------------------------------------");
				System.out.println();
			}
		} else {
			System.out.println("============================");
			System.out.println("아직 어트랙션이 존재하지 않습니다");
			System.out.println("새 어트랙션을 추가해보세요!");
			System.out.println("============================");
		}
		
	}
	
	private void save() {
		System.out.print("놀이기구의 이름을 입력해주세요 > ");
		String name = scanner.nextLine();
		System.out.print("키 제약사항을 입력해주세요 > ");
		String heightLimit = scanner.nextLine();
		System.out.print("위치를 입력해주세요 > ");
		String location = scanner.nextLine();
		
		try {
			kwc.save(name, heightLimit, location);
			System.out.println("새로운 놀이기구 추가 성공!!");
		} catch (DuplicateNameException e) {
			System.out.println(e.getMessage());
			System.out.println("새로운 놀이기구명을 작성해주세요");
		}
		
	}
	
	private void deleteAttraction() {
		System.out.println();
		System.out.println("등록된 놀이기구를 제거합니다");
		readAttractions();
		System.out.print("제거하실 놀이기구명을 입력해주세요 > ");
		String name = scanner.nextLine();
		
		if ("".equals(name) || name.length() <= 1 || name.contains("욕설") || name.isBlank() || name.isEmpty()) {
			System.out.println("올바르지 않은 놀이기구명 입니다");
		}
		
		kwc.deleteAttraction(name);
		
		System.out.println("삭제되었습니다");
	}
	
	private void findByName() {
		//키워드가 포함되어있으면 출력
		System.out.println("검색어를 입력하세요 > ");
		String keyWord = scanner.nextLine();
		
		//혼자 구현해보기
		
		//스트림으로도 해보기
		
	}

}
