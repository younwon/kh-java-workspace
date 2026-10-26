package com.kh.khworld.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.khworld.controller.RestaurantController;
import com.kh.khworld.exception.DuplicateNameException;
import com.kh.khworld.model.dto.Restaurant;

public class RestaurantService {
	List<Restaurant> restaurants = new ArrayList<Restaurant>();
	
	{
		restaurants.add(new Restaurant("아라비안바자", "츄러스, 그릴소시지, 핫도그", "어드벤처 1층 가든스테이지 좌석 근처"));
		restaurants.add(new Restaurant("스낵산호세", "츄러스, 그릴소시지, 핫도그", "어드벤처 1층 로티스 엠포리움 앞"));
		restaurants.add(new Restaurant("크리스탈팰리스(매드포갈릭)", "파스타, 함박스테이크, 로티로리피자", "어드벤처 1층 키즈토리아 옆"));
	}
	
    public List<Restaurant> readRestaurant() {
    	return restaurants;
    	
    }

    public void addRestaurant(Restaurant restaurant) {
    	checkName(restaurant.getName());
    	
    	restaurants.add(restaurant);
    }

    public boolean deleteRestaurant(String nameString) {
    	for (int i = 0; i < restaurants.size(); i++) {
			if (nameString.equals(restaurants.get(i).getName())) {
				restaurants.remove(i);
				return true;
			}
		}
    	return false;
    }

    public void findRestaurant(String nameString) {
    	
    }
    
    private void checkName(String name) {
		for (Restaurant restaurant : restaurants) {
			if (name.equals(restaurant.getName())) {
				throw new DuplicateNameException("중복된 이름의 식당이 존재합니다");
			}
		}
	}
}
