package com.kh.khworld.view;

import com.kh.khworld.controller.RestaurantController;
import com.kh.khworld.exception.DuplicateNameException;
import com.kh.khworld.model.dto.Restaurant;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RestaurantView {
    Scanner scanner = new Scanner(System.in);
    RestaurantController rc = new RestaurantController();

    public void mainMenu(){
        while (true) {
            System.out.println();
            System.out.println("식당 관리 프로그램입니다");
            System.out.println("1. 식당 전체 조회하기");
            System.out.println("2. 식당 추가하기");
            System.out.println("3. 식당 삭제하기");
            System.out.println("4. 식당 검색하기");
            System.out.println("0. 프로그램 종료하기");
            System.out.println();
            System.out.print("메뉴를 선택하세요 > ");
            int menu = 0;

            try {
                menu = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println(e.getMessage());
            } finally {
                scanner.nextLine();
            }

            switch (menu){
                case 1 : readRestaurant(); break;
                case 2 : addRestaurant(); break;
                case 3 : deleteRestaurant(); break;
                case 4 : findRestaurant(); break;
                case 0 : System.out.println("프로그램을 종료합니다"); scanner.close(); return;
                default: throw new IllegalArgumentException("Unexpected Value : " + menu);
            }
        }
    }

    private void readRestaurant() {
    	System.out.println("식당 리스트를 출력합니다");
    	System.out.println();
    	List<Restaurant> restaurants =  rc.readRestaurant();
    	if (!restaurants.isEmpty()) {
    		for (Restaurant restaurant : restaurants) {
    			System.out.println(restaurant.getName());
    			System.out.println(restaurant.getMenu());
    			System.out.println(restaurant.getLocation());
    			System.out.println();
    		}
		} else {
			System.out.println("식당을 추가해주세요");
		}
    	
    }

    private void addRestaurant() {
		System.out.print("식당의 이름을 입력해주세요 > ");
		String name = scanner.nextLine();
		System.out.print("메뉴를 입력해주세요 > ");
		String menu = scanner.nextLine();
		System.out.print("위치를 입력해주세요 > ");
		String location = scanner.nextLine();
		
		try {
			rc.addRestaurant(name, menu, location);
			System.out.println("추가 성공");
		} catch (DuplicateNameException e) {
			System.out.println(e.getMessage());
		}
    }

    private void deleteRestaurant() {
    	readRestaurant();
    	System.out.print("삭제하고 싶은 식당의 이름을 입력하세요 > ");
    	String nameString = scanner.nextLine();
    	if (rc.deleteRestaurant(nameString)) {
    		System.out.println("삭제 성공");
		} else {
			System.out.println("입력하신 식당은 없습니다");
		}
    }

    private void findRestaurant() {
    	System.out.print("검색어를 입력해주세요 > ");
    	String nameString = scanner.nextLine();
    	
    	rc.findRestaurant(nameString);
    }
}
