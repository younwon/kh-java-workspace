package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		
		//리스트의 요소를 반환받는 메소드
		Mall hanam = (Mall) mallsArrayList.get(0);
		System.out.println(hanam);
		
		//리스트 자르기
		List sub = mallsArrayList.subList(0, 2); //새로운 List에 기존에 주소값이 옮겨간다(내용물은 얕은 복사)
		System.out.println(sub);
		
		//요소 한꺼번에 추가하기
		mallsArrayList.addAll(sub);
		System.out.println(mallsArrayList); //리스트는 데이터가 중복될 수 있음
		
		((Mall)mallsArrayList.get(1)).setAddressString("고양시"); //같은 주소값을 가지고있다
		System.out.println(mallsArrayList);
		
		// 리스트에 요소가 있는지 없는지 판별하는 기능
		System.out.println(mallsArrayList.isEmpty());
		
		mallsArrayList.clear();
		System.out.println(mallsArrayList);
		System.out.println(mallsArrayList.isEmpty());
		
		/*
		 * 리스트와 배열과의 차이점
		 * 
		 * 1. 배열은 크기를 할당해야함 
		 * 리스트는 크기의 제약에서 자유롭다 -> 만약 요소가 추가된면수 부족해지면 알아서 확장
		 * 
		 * 2. 배열은 중간 위치에 요소를 추가하거나 삭제하는 등 기존값을 밀거나 땡기는 코드를 작성해야함
		 * 리스트는 그때그때 필요한 메소드들을 찾아서 호출하면 됨
		 * 
		 * 3. 배열은 같은 타입의 자료형만 사용가능
		 * 리스트는 다른 타입의 자료형을 한 번에 사용할 수 있음 -> 하지만 이건 단점에 가까움 -> 제네릭으로 보완 가능
		 * 
		 * 
		 * 사용할 데이터의 개수가 명확함 => 배열이 이득
		 * 
		 * List의 특징 : Value만 저장, 저장 시 순서 유지(index), 중복값 허용
		 * 
		 */
		
	}

}
