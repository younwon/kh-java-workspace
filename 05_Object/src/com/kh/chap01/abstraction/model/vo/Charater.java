package com.kh.chap01.abstraction.model.vo;


public class Charater {
	
	public String nameString;
	public int level;
	public String jobString;
	public String hairStyleString;
	
	public void jump() {
		System.out.println(nameString + "이(가) 점프합니다");
	}
	
	public void attack() {
		System.out.println(nameString + "이(가) 공격합니다");
		level++;
	}
}
