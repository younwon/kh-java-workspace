package com.kh.array;

import java.security.PublicKey;
import java.util.Arrays;

public class Array {
	// Variable
	// Ram 공간에 Data값을 저장하는 공간
	
	//특징
	//초기화(Initialize) 해야한 사용 가능, 선언된 Scope에서만 사용 가능
	//하나의 변수에는 하나의 값만 대입 가능, 자료형은 크기가 정해져 있음
	
	// 배열 : 하나의 배열에 여러 개의 값을 담을 수 있고 단 같은 자료형의 값들만 가능
	//동종모음(homogeneous collection)이라고도 부름
	
	public void method0() {
		// 배열 선언 =>
		// 자료형 배열식별자[];
		// 자료형[] 배열식별자;
		// int[] nums;
		
		//배열 할당 : 배열에 몇 개의 값이 들어갈 것인지 배열의 크기를 정해주는 과정
		//int[] nums = new int[3];
		//배열은 참조자료형이다
		int[] nums = new int[3];
		
		nums[0] = 10;
		nums[1] = 21;
		nums[2] = 30;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		System.out.println(sum);
		
	}
	
	public void method2() {
		// 기본자료형 : 변수공간에 실제 값을 바로 담을 수 있음(크기가 정해짐)
		// 참조자료형 : 변수공간에 주소값을 담을 수 있음(크기를 모름)
		int[] nums1 = new int[3];
		int[] nums2 = new int[3];
		System.out.println(nums1 == nums2);
		
		System.out.println(nums1.hashCode());
		System.out.println(nums2.hashCode());
		//힙 영역에 이미 생성된 객체의 정보를 기반으로 해시코드(정수 값)를 만들어내는 것
	}
	
	public void method3() {
		int[] nums = new int[3];
		
		nums[0] = 10;
		nums[1] = 14;
		nums[2] = 43;
		System.out.println("흐흫");
		try {
			nums[3] = 1;//문법적으로는 아무런 문제가 없음
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(nums));
		
		System.out.println(nums.length); //length는 필드변수임 lenght()랑 다름(변수지만 어차피 배열은 크기가 정해져있기때문에 반환이 가능)
		
	}
	
	public void method4() {
		int[] arr = {100, 200, 300, 400, 500, 600};
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void method5() {
		char[] addiction = new char[2];
		addiction[0] = '중';
		addiction[1] = '독';
		System.out.println(Arrays.toString(addiction));
		addiction = new char[3];
		addiction[2] = '성';
		System.out.println(Arrays.toString(addiction));
		
		//연결이 끊긴 참조자료형은 일정시간이 지나면 GarbegeColloection이 알아서 삭제
		// 자동 메모리 관리
		
		addiction = null; //이렇게 다 사용했다고 알림(참조자료형에만 사용가능)
	}
	
	public void method6() {
		// 얕은 복사
		int[] origin = {1,2,3};
		
		int[] copy = origin;
		
		origin[2] = 33;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
	}
	
	public void method7() {
		int[] origin = {1,2,3};
		int[] copy = new int[6];
		
		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i]; 
		}
		
		System.out.println(Arrays.toString(copy));
		
		int[] copy2 = new int[10];
		
		System.arraycopy(origin, 0, copy2, 0, 3);
		
		System.out.println(Arrays.toString(copy2));
	}
}
