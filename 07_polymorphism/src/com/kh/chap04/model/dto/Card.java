package com.kh.chap04.model.dto;

public class Card implements Payment{
    int money = 50000;

    @Override
    public int pay(int amount) {
        System.out.println("카드로 결제합니다");
        return money;
    }
}
