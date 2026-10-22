package com.kh.chap03.model.vo;

import java.awt.TexturePaint;

//Value Object (값을 담을 객체)
// 값     객체
//특징 : 불변
//VO클래스는 일반적으로 반드시 내부에 equals()와 hashCode()를 오버라이딩
// model패키지 - dao dto vo
public class Shop {
	private final String nameString;
	private final String menuString;
	private final int priceString;
	
	
	public Shop(String nameString, String menuString, int priceString) {
		super();
		this.nameString = nameString;
		this.menuString = menuString;
		this.priceString = priceString;
	}
	public String getNameString() {
		return nameString;
	}
	public String getMenuString() {
		return menuString;
	}
	public int getPriceString() {
		return priceString;
	}
	@Override
	public String toString() {
		return "shop [nameString=" + nameString + ", menuString=" + menuString + ", priceString=" + priceString + "]";
	}
	
	// equals 오버라이딩하기
	@Override
	public boolean equals(Object obj) {
		//전달받은 obj객체의 필드값과 현재 equals를 호출한 객체의 필드값이 동일하면 true 반환
		Shop shop = (Shop) obj;
		if (this.priceString == shop.priceString && this.nameString.equals(shop.nameString) 
			&& this.menuString.equals(shop.menuString)) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return (nameString + menuString + priceString).hashCode();
	}
	
}
