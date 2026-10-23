package com.kh.khworld.controller;

import java.util.List;

import com.kh.khworld.model.dto.Attraction;
import com.kh.khworld.model.service.KhWorldService;

public class KhWorldController {
	private KhWorldService kws = new KhWorldService(); // 합성

	public List<Attraction> readAttractions() {
		return kws.readAttractions();
	}
	
	public void save(String name, String heightlimit, String location) {
		//Attraction Attraction = new Attraction(name, heightlimit, location);
		kws.save(new Attraction(name, heightlimit, location));
	}
	
	public void deleteAttraction(String name) {
		
		kws.deleteAttraction(name);
	}

}
