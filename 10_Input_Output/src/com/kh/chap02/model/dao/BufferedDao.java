package com.kh.chap02.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class BufferedDao {
	// 속도 향상이 목적인 보조스트림
	// 임시 공간을 제공해서 한번에 입/출력
	
	// BufferedWriter / BufferedReader
	
	public void outputFile() {
		FileWriter fWriter = null;
		BufferedWriter bWriter = null;
		
		try {
			fWriter = new FileWriter("c.txt");
			//기반스트림을 매개변수로 받음
			bWriter = new BufferedWriter(fWriter);
			bWriter.write("하하하");
			bWriter.newLine();
			bWriter.write("후후후");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//닫을때는 역순으로(보조 -> 기반)
				bWriter.close();
				fWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void inputFile() {
		try (BufferedReader bReader = new BufferedReader(new FileReader("c.txt"))) {
			String string = "";
			while ((string = bReader.readLine()) != null) {
				System.out.println(string);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
