package com.kh.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerChat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int portNumber = 3000;
		
		try (ServerSocket serverSocket = new ServerSocket(portNumber);
			PrintWriter pWriter = null;
			BufferedReader bReader = null;) {
			
			System.out.println("대기중...");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결 성공");
			
			while (true) {
				String msgString = bReader.readLine();
				System.out.println("클라이언트가 보낸 메시지 : " + msgString);
				
				if ("끝".equals(msgString)) {
					break;
				}
			}
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
