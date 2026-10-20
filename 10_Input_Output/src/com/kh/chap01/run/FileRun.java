package com.kh.chap01.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		//코드를 작성해서 파일을 만들어보기
		
		File file = new File("메롱.txt");
		
		// 파일만들기
		try {
			file.createNewFile(); //파일만들기는 외부에서 일어나는 일
			//폴더만들기
			File folderFile = new File("folder");
			folderFile.mkdir();
			//경로지정
			File file2 = new File("folder/abc.txt");
			file2.createNewFile();
			
			System.out.println(file2.getName());
			System.out.println(file2.length());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

/*
 * IO => Input & Output
 * 뭐가 입력이고 뭐가 출력일까
 * 기준은 내 소스코드
 * 내 소스코드에서 외부로 가면 출력
 * 외부에서 내 소스코드로 오면 입력
 * 
 * 프로그램 상의 데이터를 외부매체(모니터, 스피커, DB, 프로세스, 콘솔, "파일" 등)로 출력하거나
 * 입력장치(마우스, 키보드, 마이크, DB, 프로세스, "파일" 등)로 입력받는 과정
 * 
 * IO를 하려면 프로그램하고 외부매체간의 "통로"를 만들어야함 => 스트림(Stream)
 * 
 * 스트림의 특징
 * -단방향 : 입력용과 출력용이 각각 따로 존재
 * -선입선출(First In First Out) => 시간지연 문제가 발생할 수 있음
 * 
 * 스트림의 구분
 * -스트림의 사이즈
 * 바이트 스트림 : 1Byte짜리 데이터가 이동할 수 있는 스트림 => 입력 (XXXInputStream) / 출력 (XXXOutputStream)
 * 문자 스트림 : 2Byte짜리 데이터가 이동할 수 있는 스트림 => 입력 (XXXReader) / 출력 (XXXWriter)
 * 
 * - 외부매체와 직접적인 연결 여부
 * 기반 스트림 : 외부매체랑 직접적으로 연결되는 스트림
 * 보조 스트림 : 기반스트림의 성능을 향상시키기 위한 용도로 스트림
 * => 단독 사용 불가능
 * => 속도 향상, 자료형에 맞춰서 변환, 객체단위로 입출력, 바이트 <==> 문자 등
 * 
 */
