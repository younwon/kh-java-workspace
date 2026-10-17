package com.kh.chap04.model.dto;

public class Point implements Payment{
    int money = 50000;
    Gimbap gimbap;

    @Override
    public int pay(int amount) {
        System.out.println("포인트로 결제합니다");

        return money;
    }
}
