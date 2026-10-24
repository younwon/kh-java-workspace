package com.kh.khworld.view;

import com.kh.khworld.controller.RestaurantController;

import java.util.InputMismatchException;
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
                case 1 : readGiftShop(); break;
                case 2 : addGiftShop(); break;
                case 3 : deleteGiftShop(); break;
                case 4 : findGiftShop(); break;
                case 0 : System.out.println("프로그램을 종료합니다"); scanner.close(); return;
                default: throw new IllegalArgumentException("Unexpected Value : " + menu);
            }
        }
    }

    private void readGiftShop() {
    }

    private void addGiftShop() {
    }

    private void deleteGiftShop() {
    }

    private void findGiftShop() {
    }
}
