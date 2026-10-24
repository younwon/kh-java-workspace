package com.kh.khworld.view;

import com.kh.khworld.controller.GiftShopController;
import com.kh.khworld.model.dto.GiftShop;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GiftShopView {
    Scanner scanner = new Scanner(System.in);
    GiftShopController gsc = new GiftShopController();

    public void mainMenu(){
        while (true) {
            System.out.println();
            System.out.println("기프트샵 관리 프로그램입니다");
            System.out.println("1. 기프트샵 전체 조회하기");
            System.out.println("2. 기프트샵 추가하기");
            System.out.println("3. 기프트샵 삭제하기");
            System.out.println("4. 기프트샵 검색하기");
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
        System.out.println("정보를 출력합니다");
        List<GiftShop> list = gsc.readGiftShop();
        if (!list.isEmpty()){
            for (GiftShop shop : list){
                System.out.println(shop.getName());
                System.out.println(shop.getProduct());
                System.out.println(shop.getLocation());
                System.out.println("==========================");
            }
        } else {
            System.out.println("기프트샵이 조회되지 않습니다");
        }

    }

    private void addGiftShop() {
        System.out.println("새로운 기프트샵을 추가합니다");
        System.out.print("기프트샵 이름을 입력해주세요 > ");
        String name = scanner.nextLine();
        System.out.print("제품을 입력해주세요 > ");
        String product = scanner.nextLine();
        System.out.print("위치를 입력해주세요 > ");
        String location = scanner.nextLine();

        gsc.addGiftShop(name, product, location);
    }

    private void deleteGiftShop() {
        System.out.println("삭제 페이지입니다");
        readGiftShop();
        System.out.print("삭제할 기프트샵을 선택해주세요 > ");
        String name = scanner.nextLine();
        gsc.deleteGiftShop(name);
        System.out.println("삭제 성공");

    }

    private void findGiftShop() {
        System.out.println("검색어를 입력하세요 > ");
        String keyWord = scanner.nextLine();

        System.out.println(gsc.findGiftShop(keyWord));
    }

}
