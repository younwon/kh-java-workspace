package com.kh.chap04.model.service;

import com.kh.chap04.model.dto.Gimbap;

public class PorkFilter implements GimbapFilter{

	@Override
	public boolean filter(Gimbap g) {
		
		return g.getMainMenuString().contains("제육");
	}

}
