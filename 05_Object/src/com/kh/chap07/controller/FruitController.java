package com.kh.chap07.controller;

import com.kh.chap07.model.dto.Fruit;
import com.kh.chap07.model.secvice.FruitService;

// model패키지의 클래스들과 view패키지의 클래스들 간에 중간 다리 역할 상호간에 수정으로 인한 영향을 낮추기 위해?
// view가 controller를 참조하고 controller가 service를 참조하는 식으로 유지한다
public class FruitController { // View랑 Service의 중간다리
	private FruitService fService = new FruitService();
	
	public void saveFruit(String name, String species) {
		Fruit fruit = new Fruit(name, species);
		fService.saveFruit(fruit);
	}
	
	public Fruit[] findFruit() {
		return fService.findFruit();
	}
	
	public void fertilize() {
		fService.fertilize();
	}
	
	public void harvest() {
		fService.harvest();
	}

}
