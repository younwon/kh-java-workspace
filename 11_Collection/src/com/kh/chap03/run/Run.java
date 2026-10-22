package com.kh.chap03.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.kh.chap03.model.vo.Shop;

public class Run {
	public static void main(String[] args) {
		// HashSet
		// Value값만 저장, index개념 없음
		// 중복 X, 순서 보장 X
		
		// 문자열만 담을 수 있는 HashSet
		Set<String> set = new HashSet<>();
		
		set.add("안녕");
		set.add("반가워");
		set.add("안녕");
		set.add(new String("반가워"));
		set.add(new String("안녕"));
		
		System.out.println(set);
		
		// 저장소, 특징
		
		//요소 개수
		System.out.println(set.size());
		
		Set<Shop> shops = new HashSet<Shop>();
		shops.add(new Shop("오봉집", "보쌈", 10000));
		shops.add(new Shop("한식왕비집", "떡갈비", 20000));
		shops.add(new Shop("대동옥", "곰탕", 10000));
		shops.add(new Shop("영춘옥", "곰탕", 13000));
		shops.add(new Shop("영춘옥", "곰탕", 13000));
		
		System.out.println(shops);
		
		//HashSet의 특징 : Object클래스에게 상속받아 사용할 수 있는 equals메소드의 결과가 true이고
		//hashCode메소드의 반환값이 일치하다면 동일한 객체로 판단함
		
		//set을 반복문 돌리는 법
		//set을 arrylist로 바꾸기
		//foreach문 쓰기
		//Iterator(반복자?)
		
		Iterator<Shop> iterator = shops.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// List계열, Set계열 전부 iterator()로 호출해서 반복시킬수 있음
		
		
	}
}
