package com.kh.chap04.run;

import com.kh.chap04.model.dto.Gimbap;
import com.kh.chap04.model.service.ExpensiveFilter;
import com.kh.chap04.model.service.GimbapFilter;
import com.kh.chap04.model.service.PorkFilter;

public class Run {
	public static void main(String[] args) {
		Gimbap[] gimbaps = {new Gimbap("날치알마리", "날치알", 1000), new Gimbap("제육김치마리", "제육", 1500),
							new Gimbap("간장삼겹마리", "삼겹살", 2000), new Gimbap("햄치즈마리", "햄", 1000),
							new Gimbap("불닭마리", "닭고기", 2000), new Gimbap("떙초마리", "땡초", 1500),
							new Gimbap("종합마리", "제육, 닭고기, 떙초", 3000)};
		
		//2000원이 넘는 김밥들만 골라줘
		GimbapFilter filter = new ExpensiveFilter();
		
		for (int i = 0; i < gimbaps.length; i++) {
			if (filter.filter(gimbaps[i])) {
				System.out.println("2000원이 넘는 김밥 " + gimbaps[i].getNameString());
			}
		}// 오늘 숙제 11행 부터 21행까지 말로 설명하기
		
		System.out.println("for문 편하게 쓰기");
		for (Gimbap gimbap : gimbaps) {
			System.out.println(gimbap.getNameString());
		}
		
		filter = new PorkFilter();
		for (Gimbap gimbap : gimbaps) {
			if (filter.filter(gimbap)) {
				System.out.println("제육이 포함된 " + gimbap.getNameString());
			}
		}
		
		//클래스를 새로 만들지 않고도 필요한 시점에 인터페이스를 구현할 수 있는 방법
		//익명 클래스(클래스 식별자가 없는 클래스)
		GimbapFilter cheapFilter = new GimbapFilter() {
			@Override
			public boolean filter(Gimbap g) {
				return g.getPrice() <= 1500;
			}
		};
		
		for (Gimbap gimbap : gimbaps) {
			if (cheapFilter.filter(gimbap)) {
				System.out.println("1500원보다 저렴한 김밥 : " + gimbap.getNameString());
			}
		}
		
		// 1단계 : 기본
		GimbapFilter wordFilter = new GimbapFilter() {
			@Override
			public boolean filter(Gimbap g) {
				return g.getNameString().contains("치");
			}
		};
		
		// 2단계 : 인터페이스명, 애노테이션, 접근제한자, 반환형, 메소드명 제외하는 법
		// 인터페이스에 하나의 추상메소드만 있을때 사용가능
		//                         (매개변수) -> {실행문}
		GimbapFilter wordFilter2 = (Gimbap g) -> {
			return g.getNameString().contains("치");
		};
		
		// 3단계 : 매개변수의 자료형 제거 : 타입추론 + 매개변수가 한 개라면 괄호도 생략
		GimbapFilter wordFilter3 = g -> {
			return g.getNameString().contains("치");
		};
		
		// 4단계 : 중괄호 안에 실행문이 한 줄 이라면 중괄호 + return 생략 가능
		GimbapFilter wordFilter4 = g -> g.getNameString().contains("치");
		
		//----람다식인듯----
		
		
		for (Gimbap gimbap : gimbaps) {
			if (wordFilter4.filter(gimbap)) {
				System.out.println("치가 들어가는 김밥 " + gimbap.getNameString());
			}
		}
		
	}
}
