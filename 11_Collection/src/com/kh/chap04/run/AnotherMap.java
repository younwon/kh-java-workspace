package com.kh.chap04.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap04.model.vo.Perfume;

public class AnotherMap {

	public static void main(String[] args) {
		Properties properties = new Properties(); //Map계열
		// .properties 확장자는 변경하지 않는 설정정보 : 해당 프로그램이 기본적으로 가져야할 정보들을 담는 용도로 많이 사용
		
		//properties.put("왕향수", new Perfume("450", "프루티")); //properties는 value가 문자열이여야함
		properties.setProperty("list", "ArrayList");
		properties.setProperty("Map", "HashMao");
		
		
		try {
			properties.storeToXML(new FileOutputStream("test.xml"), "2026-10-20 박윤원 이건 properties 파일임");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
