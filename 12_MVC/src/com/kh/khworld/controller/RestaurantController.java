package com.kh.khworld.controller;

import java.util.List;

import com.kh.khworld.model.dto.Restaurant;
import com.kh.khworld.model.service.RestaurantService;

public class RestaurantController {
	RestaurantService rs = new RestaurantService();
	
    public List<Restaurant> readRestaurant() {
    	return rs.readRestaurant();
    }

	public void addRestaurant(String name, String menu, String location) {
		rs.addRestaurant(new Restaurant(name, menu, location));
		
	}

    public boolean deleteRestaurant(String nameString) {
    	return rs.deleteRestaurant(nameString);
    }

    public void findRestaurant(String nameString) {
    	rs.findRestaurant(nameString);
    }

}
