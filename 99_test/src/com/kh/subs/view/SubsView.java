package com.kh.subs.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.subs.controller.SubsController;
import com.kh.subs.exception.DuplicateNameException;
import com.kh.subs.exception.InvalidCategory;
import com.kh.subs.exception.InvalidMonthlyFeeException;
import com.kh.subs.exception.InvalidPaymentDayException;
import com.kh.subs.exception.SubscriptionNotFoundException;
import com.kh.subs.model.dto.Subscription;

public class SubsView {
	Scanner scanner = new Scanner(System.in);
	SubsController sc = new SubsController();
	
	public void mainMenu() {
		while (true) {
			System.out.println();
			System.out.println("구독 서비스 관리 프로그램입니다");
			System.out.println("1. 구독 전체 조회히가");
			System.out.println("2. 구독 추가하기");
			System.out.println("3. 구독 해지하기");
			System.out.println("4. 카테고리로 검색하기");
			System.out.println("5. 월 요금 변경하기");
			System.out.println("6. 월 총액");
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
			case 1 : readSubscriptions(); break;
			case 2 : addSubscriptions(); break;
			case 3 : remove(); break;
			case 4 : find(); break;
			case 5 : update(); break;
			case 6 : totalFee(); break;
			case 0 : System.out.println("프로그램을 종료합니다"); return;
			default: System.out.println("없는 메뉴를 선택했습니다");
			}
		}
	}

	private void readSubscriptions() {
		System.out.println();
		System.out.println("구독 정보를 출력합니다");
		System.out.println();
		List<Subscription> list = sc.readSubscriptions();
		if (!list.isEmpty()) {
			for (Subscription subscription : list) {
				System.out.println("서비스명 : " + subscription.getName());
				System.out.println("------------------------------");
				System.out.println("월 요금 : " + subscription.getMonthlyFee() + "원");
				System.out.println("------------------------------");
				System.out.println("결제일 : 매월 " + subscription.getPaymentDay() + "일");
				System.out.println("------------------------------");
				System.out.println("카테고리 : " + subscription.getCategory());
				System.out.println("------------------------------");
				System.out.println();
				
			}
		} else {
			System.out.println("구독정보를 추가해주세요");
		}
		
		
	}
	
	private void addSubscriptions() {
		System.out.println("구독정보를 추가합니다");
		
		try {
			System.out.print("서비스명을 입력하세요 > ");
			String name = scanner.nextLine();
			sc.checkName(name);
			
			System.out.print("월 요금을 입력하세요(원 단위) > ");
			int monthlyFee = scanner.nextInt();
			scanner.nextLine();
			sc.checkFee(monthlyFee);
			
			System.out.print("결제일을 입력하세요(1~31) >");
			int paymentDay = scanner.nextInt();
			scanner.nextLine();
			sc.checkDay(paymentDay);
			
			System.out.print("카테고리를 입력하세요(OTT, 음악, 쇼핑, 기타) > ");
			String category = scanner.nextLine();
			sc.checkCategory(category);
			
			sc.addSubscriptions(name, monthlyFee, paymentDay, category);
			System.out.println("구독이 등록되었습니다");
			
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			return;
		} catch (DuplicateNameException e) {
			System.out.println(e.getMessage());
			return;
		} catch (InvalidMonthlyFeeException e) {
			System.out.println(e.getMessage());
			return;
		} catch (InvalidPaymentDayException e) {
			System.out.println(e.getMessage());
			return;
		} catch (InvalidCategory e) {
			System.out.println(e.getMessage());
			return;
		}
		
	}
	
	private void remove() {
		readSubscriptions();
		System.out.print("삭제하고 싶은 구독 서비스 이름을 입력하세요 > ");
		String name = scanner.nextLine();
		
		if (name.isBlank()) {
			System.out.println("서비스명을 입력하지 않았습니다");
			return;
		}
		
		try {
			sc.remove(name);
			System.out.println(name + "삭제 성공");
		} catch (SubscriptionNotFoundException e) {
			System.out.println(e.getMessage());
			return;
		}
		
		
	}
	
	private void find() {
		System.out.print("검색할 카테고리를 입력해주세요(OTT,음악,쇼핑,기타) > ");
		String category = scanner.nextLine();
		
		List<Subscription> list = sc.find(category);
		
		if (list.isEmpty()) {
			System.out.println(category + "형 구독은 없습니다");
		}
		
		for (Subscription subscription : list) {
			System.out.println(subscription.toString());
		}
		
	}
	
	private void update() {
		try {
			System.out.print("요금을 변경할 서비스명을 입력하세요 > ");
			String name = scanner.nextLine();
			System.out.print("변경할 월 요금을 입력해주세요(원) > ");
			int newFee = scanner.nextInt();
			scanner.nextLine();
			
			sc.update(name, newFee);
			System.out.println(name + " 요금이 " + newFee + "원으로 변경되었습니다");
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			return;
		} catch (SubscriptionNotFoundException e) {
			System.out.println(e.getMessage());
			return;
		}
	}
	
	private void totalFee() {
		System.out.println("월 구독료 총액 : " + sc.totalFee());
	}

}
