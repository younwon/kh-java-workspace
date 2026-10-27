package com.kh.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 입력받을때 사용하는 클래스
		ServerSocket serverSocket = null; //서버가 클라이언트의 연결 요청을 기다릴 때 사용하는 클래스
		PrintWriter pWriter = null; // 문자 데이터를 출력함 서버나 클라이언트가 상대방에게 문자열을 보낼때 사용
		BufferedReader bReader = null; // 문자 데이터를 입력받음 버퍼를 활용해 읽음
		
		// 돌아갈 포트번호 지정
		// 0~1023 Well-Known Ports 예약된 포트 쓰면 안됨
		int portNumber = 3000;
		
		//문자 → 바이트 → 바이트 → 문자 통신을 해보자
		try {
			//서버 소켓 생성 및 포트 바인딩
			//지정한 포트 번호를 서버 소캣에 연결하여
			//해당 포트에서 클라이언트의 연결 요청을 받을 준비를 한다
			serverSocket = new ServerSocket(portNumber);
			System.out.println("요청 언제오지?...대기 중....");
			
			// accept()은 연결 요청이 올 때까지 실행을 멈추고 기다림
			// 연결이 성립되면 통신에 사용할 Socket 객체를 반환받아 저장
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결 성공!!!");
			
			// Socket으로 들어오는 바이트 입력 스트림을
			// InputStreamReader로 문자 입력 스트림으로 변환하고
			// BufferedReader로 감싸서 문자 데이터를 편리하게 읽을 수 있도로 함
			bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// Socket의 출력 스트림을 이용해
			// 클라이언트에게 문자 데이터를 보낼 PrintWriter 객체 생성
			pWriter = new PrintWriter(socket.getOutputStream());
			
			String msgString = bReader.readLine();
			
			System.out.println("클라이언트가 보낸 메시지 : " + msgString);
			
			if ("안녕".equals(msgString)) {
				pWriter.println("안녕~~~");
			} else {
				pWriter.println("잘가~~");
			}
			
			//스트림에 있는 데이터를 강제로 내보내기
			pWriter.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pWriter.close();
			try {
				bReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			scanner.close();
			try {
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
