package com.kh.subway.model.service;

import com.kh.subway.model.dto.Sandwich;

@FunctionalInterface
public interface SandwichFilter {
	boolean test(Sandwich sandwich);
	
	

}
