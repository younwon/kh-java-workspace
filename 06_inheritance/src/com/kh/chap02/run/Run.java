package com.kh.chap02.run;

import com.kh.chap02.model.dto.Bracelet;
import com.kh.chap02.model.dto.PrinceGoldCrown;
import com.kh.chap02.model.dto.SwedenGoldCrown;

public class Run {

	public static void main(String[] args) {
		PrinceGoldCrown pgc = new PrinceGoldCrown();
		pgc.setName("금관총 금관");
		System.out.println(pgc.info());
		
		
		SwedenGoldCrown sgc = new SwedenGoldCrown("서머시기 금관", 8.0, 80);
		System.out.println(sgc.info());
		
		Bracelet b = new Bracelet("팔찌", 120.0, 12.0);
		System.out.println(b.info());
		
		/*
		 * 상속
		 * 중복이 발생하는 부분을 공통의 클래스로 관리
		 * 코드를 적게쓰고 새 클래스 만들기 가능 생산성 향상, 가독성 향상
		 * 
		 * 단점 : 객체간의 결합도가 높아짐 등의 단점이 꽤 많아서 오늘날에는 상속은 조심해야한다
		 * 
		 * 오늘날에는 상속보다는 합성(Composition)을 통해 구현하는 것을 권장
		 * 
		 * 상속의 특징
		 * 다중상속은 지원 안함(단일 상속만 가능)
		 * 모든 클래스는 Object 클래스의 후손 클래스 
		 * -> 모든 객체는 Object 클래스에 존재하는 멤버를 사용 가능
		 * -> Object클래스에 존재하는 메소드가 마음에 안든다? -> 재정의 가능 
		 */
	}

}
