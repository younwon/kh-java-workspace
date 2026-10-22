package com.kh.chap02.model;

public class Box<T> {
	private T itemT;
	
	public void set(T itemT) {
		this.itemT = itemT;
	}
	
	public T get() {
		return itemT;
	}

}
