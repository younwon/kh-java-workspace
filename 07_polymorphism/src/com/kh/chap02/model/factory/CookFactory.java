package com.kh.chap02.model.factory;

import com.kh.chap02.model.dto.Cook;
import com.kh.chap02.model.fried.Fried;
import com.kh.chap02.model.fried.FriedPork;
import com.kh.chap02.model.fried.FriedRice;

public class CookFactory {
	public Fried createRice() {
		return new FriedRice();
	}
	
	public Fried createPork() {
		return new FriedPork();
	}
	
	public Fried create() {
		return createPork();
	}
}
