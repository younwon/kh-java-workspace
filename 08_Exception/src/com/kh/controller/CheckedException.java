package com.kh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
	
	public void readString() {
		System.out.println("나는 체크드 익셉션");
		//사용자에게 문자열을 받아서 입력받은 문자열의 길이를 출력(Scanner 없이)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		 * CheckedException
		 * 예외처리를 해야한다는 사실을 체크 해주는 예외들! => 문법적으로 반드시 예외처리를 해야함
		 */
		
		try {
			System.out.print("문자열을 입력하시오 > ");
			String str = br.readLine();
			System.out.println(str.length());
		} catch (IOException e) {//주로 외부매체 입/출력 시 사용
			e.printStackTrace();
		}
		
	}
	
	public void bang() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
	}
}
