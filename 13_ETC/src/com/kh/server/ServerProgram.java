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
		Scanner scanner = new Scanner(System.in);
		ServerSocket serverSocket = null;
		PrintWriter pWriter = null;
		BufferedReader bReader = null;
		
		// 돌아갈 포트번호 지정
		
		int portNumber = 3000;
		
		try {
			//서버소켓을 포트바이딩
			serverSocket = new ServerSocket(portNumber);
			
			System.out.println("요청 언제오지?...대기 중....");
			
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결 성공!!!");
			
			bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
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
