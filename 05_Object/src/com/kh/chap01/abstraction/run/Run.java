package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Dog;

public class Run {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.name = "나폴레옹";
		System.out.println(dog.name);
		
		Dog khan = new Dog();
		khan.name = "징기즈칸";
		System.out.println(khan.name);
		//클래스 : 사용자 정의 자료형
		
		dog.walk();
		khan.walk();
		
		dog.age = 6;
		System.out.println(dog.age);
		
		dog.swingTail();
		System.out.println(dog.age);

	}
	
	//나만의 클래스 10개만들기

}
