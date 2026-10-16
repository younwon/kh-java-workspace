package com.kh.chap01;

public class Run {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.printParent();
		
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent();
		
		Parent p2 = new Child1();
		p2.printParent();
		
		//상속을 통해 부모클래스로부터 상속받을 수 있는 가장 중요한 것은?
		//=> 타입(자료형)
		//상속을 받으면 부모클래스의 타입을 사용할수있다
		//대입되기전에 Child1객체가 Prent타입으로 형변환을 수행해서 대입됨
		
		((Child1)p2).printChild1();
		
		/*
		 * 클래스 형 변환
		 * "상속 구조" 일 경우에만 가능
		 * 
		 * 1. UpCasting
		 * 자식 => 부모 (자동)
		 * 2. DownCasting
		 * 부모 => 자식 (명시해줘야함)
		 */
		
		Parent[] arr = {new Child1(), new Child2(), new Child1(), new Child2()}; //이게 가능
		for (int i = 0; i < arr.length; i++) {
			arr[i].print(); //동적바인딩(실행할때만)
		}
		
	}

}
