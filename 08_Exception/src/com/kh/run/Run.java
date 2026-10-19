package com.kh.run;

import com.kh.controller.CheckedException;
import com.kh.controller.UncheckException;
import com.kh.diary.dto.Diary;
import com.kh.diary.view.DiaryView;

public class Run {

	public static void main(String[] args) {
		// 뭘 쳐야하지 => 한 줄씩 주석으로 설명달기 => 수업이 끝나면 수업영상 돌려보기
		//System.out.println(); // 출력창에 출력함(이런느낌)
		
		/*
		 * 에러(error)
		 * 
		 * - 시스템 에러 : 컴퓨터의 오작동으로 발생
		 * - 컴파일 에러 : 프로그램 실행 전 소스코드상에서 문법적인 문제로 발생하는 에러
		 * - 런타임 에러 : 프로그램 실행 중 발생하는 에러 -> 문법적으로는 문제가 없음
		 * - 로지컬 에러 : 소스코드 상 문제 없음, 실행했을 때도 문제 없이 잘 돌아감 -> 의도와 다르게 동작
		 * 
		 * 예외(Exception) : 시스템 어러를 제외한 나머지 주로 런타임에러를 의미함
		 */
		
		UncheckException uc = new UncheckException();
		
		CheckedException ce = new CheckedException();
		
		DiaryView dv = new DiaryView();
		dv.mainMenu();
		
	}

}
