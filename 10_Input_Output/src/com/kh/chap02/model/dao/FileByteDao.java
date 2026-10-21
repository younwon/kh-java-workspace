package com.kh.chap02.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Data Access Object)

// 데이터를 보관하는 공간에 직접 접근해서 입 / 출력하는 메소드들을 가지고 있음
public class FileByteDao {
	
	// 프로그램 --> 외부(파일)(출력)
	public void outputToFile() {
		FileOutputStream fos = null;
		
		// 1Byte 바이트 스트림
		try {
			fos = new FileOutputStream("a.txt");
			//파일이 존재하지 않으면 새롭게 생성하면서 스트림 연결
			//두 번째 인자값으로 true를 전달하면 이어쓰기
			
			//스트림을 통해 데이터를 출력
			fos.write(97);
			fos.write(98);
			fos.write(99);
			
			fos.write('A');
			fos.write('b');
			
			//fos.write('박');
			//fos.write('윤');
			// 1Byte의 범위 = -128~127
			// 바이트스트림은 한계가있음(한글안됨도 포함)
			// 문자스트림으로 해결
			
			//스트림 사용이 끝남
			//꼭 지켜야하는 약속이 있음
			//코드상에서 전부 사용하면 자원반납을 해주어야함
			
			// 자원반납 => .close()
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 프로그램 <= 외부매체(파일)(입력)
	public void inputFromFile() {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			/*
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			*/
			int num = 0;
			while ((num = fis.read()) != -1) {
				//System.out.println(fis.read()); 이건 출력할때Byte포인트가 움직이는 문제가 발생
				System.out.println((char) num);
			}
			
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
