package com.kh.chap03.run;

import com.kh.chap03.model.dto.Alcohol;
import com.kh.chap03.model.dto.Beverage;
import com.kh.chap03.model.dto.Coffee;
import com.kh.chap03.model.dto.Water;

public class Run {

	public static void main(String[] args) {
		Beverage beverage = new Beverage("마실거", "100ML", "검은색");
		System.out.println(beverage.info());
		
		Water water = new Water("삼다수", "500ML", "투명", "한라산");
		System.out.println(water.info());
		
		Coffee coffee = new Coffee("라떼", "1L", "갈색", 20);
		System.out.println(coffee.info());
		
		Alcohol alcohol = new Alcohol("카스", "550ML", "노랑", 7);
		System.out.println(alcohol.info());
		
		System.out.println(beverage);
	}

}
