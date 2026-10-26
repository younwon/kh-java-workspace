package com.kh.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {

	public static void main(String[] args) {
		/*
		 * 네트워크(Network)
		 * 
		 * 통신 가능한 두 대 이상의 장치들을 물리적 또는 논리적으로 연결해놓은 환경
		 * 통신이 가능한 장치 == Host
		 * 네트워크의 목적 : 데이터의 교환
		 * 
		 * 종간단 실제 통신 장치 => EndPoint
		 * 
		 * 자바만 가지고 클라이언트와 서버의 간단한 통신을 구현
		 * 
		 * 소켓(Socket)
		 * 
		 * Process(프로그램이 메모리에 적재된 상태) 간의 통신을 담당
		 * 
		 */
		
		try {
			InetAddress localHostAddress = InetAddress.getLocalHost();
			
			System.out.println(localHostAddress);
			
			InetAddress googleHostAddress = InetAddress.getByName("www.google.com");
			System.out.println(googleHostAddress);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
