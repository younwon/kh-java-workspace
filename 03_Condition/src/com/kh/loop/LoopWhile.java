package com.kh.loop;

import java.math.MathContext;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class LoopWhile {
	// for => 개발자가 반복을 몆 번 해야하는지 명확하게 알고 있다
	// while => 개발자가 박복을 몇 번 해야하는지 가늠할 수 가 없다
	public void method0() {
		int i = 0;
		while (i < 3) {
			i++;
			System.out.println(i);
		}
	}
	
	public void method1() {
		while (true) {
			System.out.println("이렇게");
		}
	}
	
	//무지성 반복문 => 불가능
	//무지성 조건 => 가능(if)
	public void method2() {
		int sum = 0;
		int i = 0;
		while (i < 10) {
			i++;
			sum += i;
		}
		System.out.println(sum);
		
	}
	
	public void generateLottoNumber() {
		double number = Math.random();
		
		System.out.println(number * 10);
		System.out.println((int)(number * 10) );
		System.out.println((int)(number * 10) + 1);
		System.out.println((int)(number * 10) + 1);
		System.out.println((int)(number * 45) + 1);
		
		int[] nums = new int[6];
		int num = 0;
		for (int i = 0; i < nums.length; i++) {
			num = (int) (Math.random() * 45) + 1;
			for (int j = 0; j <= i; j++) {
				while (nums[j]==num ) {
					num = (int) (Math.random() * 45) + 1;
				}
			}
			nums[i] = num; 
		}
		for (int i : nums) {
			System.out.print(i + ", ");
		}
	}
	
	public void lotto() {
		Set<Integer> lottoSet = new HashSet<Integer>();
	}
	
	// break와 continue
	// break와 return차이
	public void method4() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("글자수 체크(그만하고 싶으시면 exit을 입력하세요) > ");
			String keyword = scanner.nextLine();
			if (keyword.equals("exit")) {
				break;
				//return은 메서드를 벗어남;
			}
			System.out.println(keyword + "은(는) " + keyword.length() + "글자입니다.");
		}
		
		System.out.println("다음에 또 만나요~~~");
	}
	 //continue
	public void checkId() {
		System.out.println("회원가입 서비스입니다");
		Scanner scanner = new Scanner(System.in);
		String userIdString;
		
		while (true) {
			System.out.print("아이디를 입력해주세요(10글자를 넘기지 말아주세요) >> ");
			userIdString = scanner.nextLine();
			
			if (userIdString.length() > 10) {
				System.out.println("아이디는 10글자 이하만 가능합니다");
				continue;
			}
			System.out.println("사용 가능한 아이디 입니다");
			break;
		}
		System.out.println("아이디 : " + userIdString);
	}
	
	
	
	
	
}
