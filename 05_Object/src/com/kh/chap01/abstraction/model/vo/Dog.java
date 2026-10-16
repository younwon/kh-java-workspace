package com.kh.chap01.abstraction.model.vo;

public class Dog {
	//필드
	public String name;
	public String specie;
	public int age;
	public char gender;
	public boolean neuter;
	
	// 생성자
	public Dog() {
	}
	
	// 메소드
	public void walk() {
		System.out.println(name + "이(가) 걷는다");
	}
	
	public void swingTail() {
		System.out.println(name + "이(가) 꼬리를 흔든다");
		age++;
	}
}
