package com.kh.chap02.model.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileCharDao {
	//출력 => 문자스트림
	public void outputToFile() {
		FileWriter fw = null;
		
		try(FileWriter fWriter = new FileWriter("b.txt")){ //AutoCloseable인터페이스를 구현한 클래스만 자동 close()가능
			fWriter.write("한 줄 단위로 출력 가능 ");
			fWriter.write("한글도 잘됨");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void myDiary() {
		//다이어리 입력받다서 외부 파일로 출력
		// 파일명 : 2026년 10월 21일 오늘의 다이어리.txt
		Date date = new Date();
		System.out.println(date);
		
		String titleString = new SimpleDateFormat("yyyy년 MM월 dd일").format(date);
		System.out.println(titleString);
		
		StringBuilder sb = new StringBuilder();
		sb.append(titleString).append(" 오늘의 다이어리.txt");
		System.out.println(sb);
		
		try(FileWriter fWriter = new FileWriter(sb.toString());
			Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("내용을 입력해주세요 > ");
			String contentString = scanner.nextLine();
			
			fWriter.write("오늘의 다이어리 내용 : \t" + contentString);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
