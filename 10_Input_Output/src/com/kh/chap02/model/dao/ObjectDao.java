package com.kh.chap02.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap02.model.dto.Message;

public class ObjectDao {
	//출력
	//객체 단위로 출력을 할 때 필요한 보조스트림
	public void outputFile() {
		Message message = new Message("말이안됨");
		try (ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream("d.txt"))) {
			fos.writeObject(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//입력
	public void inputFile() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d.txt"))){
			Message message = (Message) ois.readObject();
			System.out.println(message);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
