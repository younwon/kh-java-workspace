package com.kh.chap03.run;

import java.util.Scanner;

import com.kh.chap03.service.BlackBeansSauceNoodles;
import com.kh.chap03.service.DeliveryService;
import com.kh.chap03.service.EightZero;
import com.kh.chap03.service.HongChineseRestaurant;

public class Run {
	public static void main(String[] args) {
		System.out.println("짜장면 주문 서비스에 오신것을 환영합니다");
		System.out.println("주문하실 중국집을 선택하시기 바랍니다");
		System.out.println("1. 홍반점");
		System.out.println("2. 팔공반점");
		System.out.print("메뉴를 선택해주세요 > ");
		Scanner scanner = new Scanner(System.in);
		int menuNo = scanner.nextInt();
		BlackBeansSauceNoodles bbsn = null;
		DeliveryService d = null;
		
		switch(menuNo) {
		case 1 : bbsn = new HongChineseRestaurant();
				d = new HongChineseRestaurant();
				break;
		case 2 : bbsn = new EightZero(); 
				d = new EightZero();
				break;
		}
		
		bbsn.makeNoodles();
		d.delivery();
	}
}
