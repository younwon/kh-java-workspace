package com.kh.diary.controller;

import com.kh.diary.dto.Diary;
import com.kh.diary.exception.DiaryBoomException;

public class DiaryController {
	private Diary diary;
	
	public void decoDiary(String logo, String title, String signature) {
		diary = new Diary(logo, title, signature);
	}
	
	public Diary getDiary() {
		return diary;
	} 
	
	public void boom() {
		// 90%활률로 문제없음 10%활률로 다이어리 다 날라감
		int rand = (int)(Math.random() * 100) + 1;
		
		if(rand < 11) {
			diary = null;
			throw new DiaryBoomException("다이어리가 폭팔했습니다");
		}
	}
	
	/*
	 * 나중에 더 배우면 들어가는 절차
	 * 1. 유호값검증 => 값이 존재하는가, 적절한 값인가 등을 검증
	 * 2. 중복검사
	 * 아직은 패스
	 */

}