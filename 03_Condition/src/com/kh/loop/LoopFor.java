package com.kh.loop;

import java.util.Iterator;
import java.util.Scanner;

public class LoopFor {
	public void method0() {
		
		int floor = 10;
		int space = floor-1;
		int star = 1;
		for (int i = 0; i < floor; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			space--;
			star += 2;
			System.out.println();
		}
		
	}
	//제어변수명은 보편적으로 i, j, k
	public void method1() {
		for (int i = 1; i <= 32; i++) {
			System.out.println(i);
		}
	}
	
	public void times() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단을 외자 >> ");
		int num = scanner.nextInt();
		System.out.println(num + "단을 출력하겠습니다");
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
	}
}
