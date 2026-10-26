package com.kh.subway.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.kh.subway.model.dto.Sandwich;
import com.kh.subway.model.service.SandwichFilter;

public class Run {

	public static void main(String[] args) {
		
		List<Sandwich> binList = List.of(new Sandwich("이탈리안 비엠티", 8000, "햄")
										,new Sandwich("에그마요", 5500, "달걀")
										,new Sandwich("비엘티", 7000, "베이컨")
										,new Sandwich("치킨 데리야끼", 6500, "닭")
										,new Sandwich("로스트 치킨", 7000, "닭")
										,new Sandwich("스파이시 이탈리안", 8000, "햄")
										,new Sandwich("풀드포크 바비큐", 9000, "소고기")
										,new Sandwich("치킨 베이컨 아보카도", 7500, "닭")
										,new Sandwich("안창 비프", 9000, "소고기")
										,new Sandwich("쉬림프", 8000, "새우")
										);
		
		SandwichFilter beeFilter = s -> s.getMaterialString().contains("소고기");
		
		for (Sandwich sandwich : binList) {
			if (beeFilter.test(sandwich)) {
				System.out.println(sandwich.getNameString());
			}
		}
		
		System.out.println("-----------------------------------");
		
		SandwichFilter expensiveFilter = s -> s.getPrice() >= 7500;
		
		for (Sandwich sandwich : binList) {
			if (expensiveFilter.test(sandwich)) {
				System.out.println(sandwich.getNameString());
			}
		}
		
		System.out.println("-----------------------------------");
		
		
		//Predicate<T> - 판별 T - boolean 반환
		Predicate<Sandwich> isPork = s -> s.getMaterialString().contains("햄");
		for (Sandwich sandwich : binList) {
			if (isPork.test(sandwich)) {
				System.out.println(sandwich.getNameString());
			}
		}
		
		System.out.println("-----------------------------------");
		
		//Function<T, R> -> 변환 T -> R(리턴타입)
		Function<Sandwich, String> getNameFunction = s -> s.getNameString() + "는 " + s.getPrice() + "원 입니다";
		System.out.println(getNameFunction.apply(new Sandwich("에그마요", 3400, "달걀")));
		
		System.out.println("-----------------------------------");
		
		// Consumer<T> -> 소비 T -> void
		Consumer<Sandwich> printConsumer = s -> System.out.println(s.getMaterialString());
		printConsumer.accept(new Sandwich("에그마요", 3444, "달걀"));
		
		System.out.println("-----------------------------------");
		
		// Supplier<T> -> 공급 매개변수 없음 -> T 반환
		Supplier<Sandwich> defaultSand = () -> new Sandwich("기본", 1000, "채소");
		Sandwich d = defaultSand.get();
		System.out.println(d);
		
		/*
		 * T   -> boolean
		 * T   -> R
		 * T   -> 없음
		 * 없음 -> T
		 */
		
		// 재료가 햄인 샌드위치들만 따로 관리
		System.out.println("-----------------------------------");
		List<Sandwich> redSandwichs = new ArrayList<Sandwich>();
		
		for (int i = 0; i < binList.size(); i++) {
			if (binList.get(i).getMaterialString().equals("햄")) {
				redSandwichs.add(binList.get(i));
			}
		}
		System.out.println(redSandwichs);
		
		List<Sandwich> redList = binList.stream().filter(s -> s.getMaterialString().equals("햄")).toList();
		System.out.println(redList);
		
		List<String> nameList =binList.stream().filter(s -> s.getMaterialString().equals("햄"))
											   .map(s -> s.getNameString())
											   .toList();
		System.out.println(nameList);
		
		List<String> meterialsList = binList.stream().map(s -> s.getMaterialString()).distinct().toList();
		System.out.println(meterialsList);
		
		String sandString = binList.stream().map(s -> s.getNameString()).collect(Collectors.joining(","));
		
		//오늘부터 해야 할 일 : 11월 1일까지 매일
		// 자바 복습하기(퀴즈풀기, 자기전에 책읽기)
		// 코드 작성 -> MVC -> 최소 1일 1회
		
		
		
		
	}

}
