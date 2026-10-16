package com.kh.chap07.model.secvice;

import com.kh.chap07.model.dto.Fruit;

public class FruitService { // 연산
	private Fruit fruit;
	//private Fruit secondFruit;
	//private Fruit thirdFruit;
	
	private Fruit[] fruits = new Fruit[2];
	
	public void saveFruit(Fruit fruit) {
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i]== null ) {
				fruits[i] = fruit;
				return;
			}
		}
	}
	
	public Fruit[] findFruit() {
		return fruits;
	}
	
	public void fertilize() {
		fruit.setBrix(fruit.getBrix()+1);
	}
	
	public void harvest() {
		fruit = null;
	}
}
