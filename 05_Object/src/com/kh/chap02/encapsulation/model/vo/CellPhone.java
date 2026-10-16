package com.kh.chap02.encapsulation.model.vo;

public class CellPhone {
	private String productName;
	private String networkProvider;
	private double size;
	private String color;
	
	public void hi() {
		System.out.println("hi");
	}
	
	//setter()
	/*
	 * DTO(Data Transfer Object)
	 * 
	 * public으로 하고 set으로 시작 낙타봉표기법(camelCase)도 꼭지키자
	 */
	public void setSize(double size) {
		//객체 내부에서 this 라는 키워드는 해당 객체 자기자신의 주소값을 가리킴
		System.out.println("setSize 20행 : " + this);
		this.size = size;
	}
	
	//데이터를 반환해주는 getter() -> 꼭 있어야함!!!
	// getter는 public
	// get을 붙이고 낙타봉 표기법을 사용
	// 꼭 만들자
	
	public double getSize() {
		return size;
	}
	
	public void setProductName(String productNName) {
		this.productName = productNName;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setNetworkProvider(String networkProvider) {
		this.networkProvider = networkProvider;
	}
	
	public String getProducName() {
		return productName;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getNetworkProvider() {
		return networkProvider;
	}
	
	public String info() {
		String info = "제품명 : " + productName + " 색상 : " + color + " 통신사 : " + networkProvider;
		return info;
	}
	
	/*
	 * AccessModifier(접근제어자)
	 * 
	 * public : 어디서든(같은 패키지, 다른 패키지, 클래스 내/외부 전부 포함) 접근가능
	 * 
	 * protected : 같은 패키지라면 무조건 접근 가능, 다른 패키지라면 상속구조인 클래스에서만 접근 가능
	 * 
	 * default(package friendly) : 아무것도 지정안하면 이거, 같은 패키지에서만 접근 가능
	 * 
	 * private : 오직 클래스 내부
	 */

}
