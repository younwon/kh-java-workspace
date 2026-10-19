package com.kh.chap04.model.service;

import com.kh.chap04.model.dto.Gimbap;

@FunctionalInterface //추상메소드를 하나만 가지겠다는 애노테이션
public interface GimbapFilter {
	
	boolean filter(Gimbap g);

}
