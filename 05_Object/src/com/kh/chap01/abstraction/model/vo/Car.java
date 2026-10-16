package com.kh.chap01.abstraction.model.vo;

import java.util.Scanner;

public class Car {
	public String nameString;
	public int mileage;
	public String modelString;
	public String colorString;
	
	public void stop() {
		System.out.println("차를 멈춥니다");
	}
	
	public void drive() {
		System.out.println("주행합니다");
		mileage += 1;
	}
	
	public void recolor() {
		System.out.print("새로운 색상을 선택하세요(빨강, 검정, 파랑) > ");
		Scanner scanner = new Scanner(System.in);
		colorString = scanner.nextLine();
	}
	

}
