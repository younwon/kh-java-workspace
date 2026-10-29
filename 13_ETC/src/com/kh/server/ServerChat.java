package com.kh.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerChat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrintWriter pWriter = null; // 문자 데이터를 출력함 서버나 클라이언트가 상대방에게 문자열을 보낼때 사용
		BufferedReader bReader = null; // 문자 데이터를 입력받음 버퍼를 활용해 읽음

		int portNumber = 3000;
		
		try (ServerSocket serverSocket = new ServerSocket(portNumber);) {
			
			System.out.println("대기중...");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결 성공");
			
			bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pWriter = new PrintWriter(socket.getOutputStream());
			
			while (true) {
				String msgString = bReader.readLine();
				System.out.println("클라이언트가 보낸 메시지 : " + msgString);
				
				System.out.print("클라이언트에게 전송할 메시지를 입력하세요 > ");
				String msg = scanner.nextLine();
				
				if ("끝".equals(msg)) {
					break;
				}
				
				pWriter.println(msg);
				pWriter.flush();
				
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			pWriter.close();
			try {
				bReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		scanner.close();

	}

}
