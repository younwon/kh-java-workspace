package com.kh.khworld.model.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.management.RuntimeErrorException;

import com.kh.khworld.exception.DuplicateNameException;
import com.kh.khworld.model.dto.Attraction;

public class KhWorldService {
	private List<Attraction> attractions = new ArrayList<Attraction>();
	
	{
		// 초기화 블럭
		// 어떤 생성자를 호출하던지 초기화 블럭에 내용을 실행함
		System.out.println("초기화 블럭");
		attractions.add(new Attraction("콩X고질라더라이드", "110cm ~ 195cm 탑승 가능", "3F 게임빌리지/스낵바 앞"));
		attractions.add(new Attraction("귀담", "키 제한 없이 탑승 가능", "매직아일랜드 매직캐슬 뒤편"));
		attractions.add(new Attraction("에오스타워", "120cm 이상 탑승 가능", "매직아일랜드 자이로스핀 좌측"));
	}
	
	static {
		// 스태틱 블럭
		// 프로그램 시작시 단 한번
		System.out.println("스태틱 블럭");
	}

	public KhWorldService() {
		System.out.println("생성자 블럭");
		
	}
	
	public List<Attraction> readAttractions() {
		return attractions;
	}
	

	/**
	 * @param attraction
	 * @author 박윤원
	 * @since 2026-10-23
	 * 
	 * 입력받은 값을 가지고 name 중복체크 후 리스트의 요소로 추가해주는 메소드
	 */
	public void save(Attraction attraction) {
		// 절대로 name 필드가 중복되선 안됨
		nameCheck(attraction.getName());

		this.attractions.add(attraction);
	}
	
	public void deleteAttraction(String name) {
		for (int i = 0; i < attractions.size(); i++) {
			if (attractions.get(i).getName().equals(name)) {
				attractions.remove(i);
				break; //반복이 배열의 크기만큼 도는걸 방지하기 위해
			}
		}
	}
	
	//SRP(Single Responsibility Principle)(단일 책임 원칙)
	private void nameCheck(String name) {
		for (Attraction a : attractions) {
			if (a.getName().equals(name)) {
				throw new DuplicateNameException("중복된 이름입니다");
			}
		}
	}
}
