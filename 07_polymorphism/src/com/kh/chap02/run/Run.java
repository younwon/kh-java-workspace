package com.kh.chap02.run;

import com.kh.chap02.model.dto.Cook;
import com.kh.chap02.model.dto.Main;
import com.kh.chap02.model.dto.Salad;
import com.kh.chap02.model.factory.CookFactory;
import com.kh.chap02.model.fried.Fried;
import com.kh.chap02.model.fried.FriedPork;
import com.kh.chap02.model.fried.FriedRice;
import com.kh.chap02.model.info.Jajang;
import com.kh.chap02.model.info.JjamBbong;

public class Run {

	public static void main(String[] args) {
		Main main = new Main("조규철");
		main.cooking();
		Salad salad = new Salad("이슬철");
		salad.cooking();
		
		Cook[] cooks = {main, salad};
		for (Cook cook : cooks) {
			cook.cooking();
		}
		
		// 추상화란 => 요구사항들 중에서 공통점을 찾고, 공통점에서 필요없는것 제거
		
		JjamBbong jjamBbong = new JjamBbong();
		jjamBbong.makeJjamBbong(); //짬뽕클래스에 의존적인 코드
		
		Jajang jajang = new Jajang();
		jajang.makeJajang(); //의존적인 코드
		
		//타입 은닉
		Fried fried = new FriedRice();
		fried.fried(); // Fried클래스에 의존
		fried = new FriedPork();
		fried.fried(); 
		
		//교체와 변경이 쉬워짐
		//또 다른 Fried타입을 추가한것도 쉬워짐
		//CookFactory를 거치면 모두 다 같은 Fried로 취급
		CookFactory cookFactory = new CookFactory();
		Fried fried2 = cookFactory.create();
		fried2.fried();
	}

}
