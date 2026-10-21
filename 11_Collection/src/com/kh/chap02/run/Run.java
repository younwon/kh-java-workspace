package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.Arrays;

import com.kh.chap02.model.dto.Mall;

public class Run {

	public static void main(String[] args) {
		/*
		 * 추상적 자료형(Abstract Data Type) => 자바는 Interface 구현해놈 (Set, List 등)
		 * +
		 * 구현 => Class
		 * +
		 * 알고리즘 => method
		 * =================================
		 * Collection Framework
		 */
		
		Mall[] malls = new Mall[3];
		ArrayList mallsArrayList = new ArrayList();
		System.out.println(malls);
		System.out.println(mallsArrayList);
		
		malls[0] = new Mall("스타필드", "하남");
		malls[1] = new Mall("스타필드", "고양");
		malls[2] = new Mall("스타필드", "안성");
		
		System.out.println(Arrays.toString(malls));
		
		mallsArrayList.add(new Mall("스타필드", "하남"));
		mallsArrayList.add(new Mall("스타필드", "고양"));
		mallsArrayList.add(new Mall("스타필드", "안성"));
		mallsArrayList.add(new Mall("더현대", "여의도"));
		mallsArrayList.add(1);
		mallsArrayList.add(true);
		mallsArrayList.add("asdf");
		
		System.out.println(mallsArrayList);
		
		//기존 Object[]의 크기를 넘어서는 요소를 추가해도
		//System.arraycopy메소드를 호출해서 갚은 복사로 더 큰 배열을 할당함
		
		// add메소드 오버로딩
		// add(int index, E e) : 원하는 인덱스에 값넣기
		
		mallsArrayList.add(0, new Mall("롯데백화점", "소공동"));
		System.out.println(mallsArrayList);
		// 요소를 추가했을 때 기존 요소를 한 칸씩 뒤로 밀어주는 코드가 있다
		
		//요소를 수정하는 메소드
		mallsArrayList.set(0, new Mall("신세계백화점", "회현동"));
		System.out.println(mallsArrayList);
		
		//요소 삭제
		mallsArrayList.remove(0);
		System.out.println(mallsArrayList);
		
		String msg = "123";
		
		if (msg.equals("123")) {
			System.out.println("공격적인 코드(null포인트 예외발생할 수 있음)");
		}
		if ("123".equals(msg)) {
			System.out.println("방어적인 코드");
		}
		
		//리스트 크기 반환
		System.out.println(mallsArrayList.size());
	}

}
