package com.kh.chap02.run;

import com.kh.chap02.model.dao.BufferedDao;
import com.kh.chap02.model.dao.FileByteDao;
import com.kh.chap02.model.dao.FileCharDao;
import com.kh.chap02.model.dao.ObjectDao;

public class Run {

	public static void main(String[] args) {
		FileByteDao fbd = new FileByteDao();
		FileCharDao fcd = new FileCharDao();
		BufferedDao bfd = new BufferedDao();
		ObjectDao od = new ObjectDao();
		
		od.inputFile();
		

	}

}
