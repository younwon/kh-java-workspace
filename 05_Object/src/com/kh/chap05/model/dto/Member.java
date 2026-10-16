package com.kh.chap05.model.dto;

public class Member {
	// 필드
	private String userId;
	private String userPwd;
	private String ninkName;
	// 생성자(Constructor) : 객체 생성 시 초기화를 담당하는 요소
	/*
	 * 생성자는 클래스 명과 동일해야함
	 * 반환형이 존재해선 안됨
	 * 생성자를 작성하면 기본생성자는 만들어주지 않는다
	 * 생성자 오버로딩 가능
	 */
	public Member() {
		System.out.println("기본 생성자 호출~");
	}
	
	public Member(String userId) {
		System.out.println("아이디 초기화");
		this.userId = userId;
	}
	
	public Member(String userId, String userPwd, String ninkName) {
		System.out.println("전체 값 초기화");
		this.userId = userId;
		this.userPwd = userPwd;
		this.ninkName = ninkName;
	}
	
	//메서드
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public void setNinkName(String ninkName) {
		this.ninkName = ninkName;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public String gerUserPwd() {
		return userPwd;
	}
	
	public String getNinkName() {
		return ninkName;
	}
	
	public String info() {
		return ninkName  + " 고객의 아이디 : " + userId + ", 비번 : " + userPwd;
	}
	
}
