package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.CellPhone;

public class Run {

	public static void main(String[] args) {
		CellPhone cellPhone = new CellPhone();
		cellPhone.hi();
		
		new CellPhone().hi();//이렇게 하면 실행되고 가비지가 된다
		
		//자바에서 변수 공간에 대입될 수 있는 값의 종류 10가지
		// 기본자료형 8개
		//참조자료형 : 주소값, null값
		// 주소값 == 객체
		
		//cellPhone.productName = "아이폰18Pro";
		//System.out.println(cellPhone.productName);
		//cellPhone.size = -11.1;
		//System.out.println(cellPhone.size);
		
		//캡슐화(encapsulation)
		// private는 필드가 외부에서는 안보임 직접접근 불가
		
		//속성(데이터)과 해당 데이터를 조작하는 행동(메소드)를 하나의 단위로 묶는 것
		
		System.out.println("Main 28행 : " + cellPhone);
		
		cellPhone.setSize(1.0); //넘기는 값(argument, 인자값, 인수)
		
		System.out.println(cellPhone.getSize());
		
		cellPhone.setProductName("갤럭시S 23 Ultra");
		cellPhone.setColor("silver");
		cellPhone.setNetworkProvider("U+");
		
		System.out.println("나의 휴대폰 " + cellPhone.getProducName() + "의 색상은 " + cellPhone.getColor() + "이고 통신사는 " + cellPhone.getNetworkProvider() + "이다");
		
		System.out.println(cellPhone.info());
	}

}
