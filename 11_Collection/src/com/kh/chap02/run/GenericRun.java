package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap02.model.Box;
import com.kh.chap02.model.dto.Mall;

public class GenericRun {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("하이");
		list.add(1);
		list.add(true);
		
		//꺼낼때 불편함
		String textString = (String)list.get(0);
		int number = (int)list.get(1);
		
		Box box = new Box();
		box.set(1);
		box.set("하하");
		box.set(new Mall("스타필드", "고양"));
		
		Box<String> stringBox = new Box<String>();
		stringBox.set("하하하");
		//제네릭 : 타입지정을 컴파일 시점에 체크하는 것
		
		List<Mall> malls = new ArrayList<Mall>();
		malls.add(new Mall("스타필드", "4"));
		malls.add(new Mall("신세계", "5"));
		malls.add(new Mall("롯데", "6"));
		
		Mall mall = malls.get(0);
		
		for (Mall mall1 : malls) {
			System.out.println(mall1.getBrandString());
		}
		
		//제네릭은 다룰 요소의 타입을 제한하면서 실수를 줄일 수 있음

	}
	
	/*
	 * 제네릭을 사용할때 개발자들끼리의 암묵적인 약속
	 * T -> Type => 아무타입이나 OK
	 * E -> Element => 요소라는 의미를 적을 땐 E로 적자
	 * N -> Number => 숫자타입만 적게하나 
	 * R -> Return => 반환타입
	 * K -> Key => Map의 Key타입
	 * V -> Value => Map의 Value값
	 */

}
