package com.kh.chap05.run;

import java.util.Scanner;

import com.kh.chap05.model.dto.Member;

public class Run {

	public static void main(String[] args) {
		Member member = new Member();
		System.out.println(member.info());
		
		Member member1 = new Member("dbs", "123", "메너티");
		System.out.println(member1.info());
		
		

	}

}
