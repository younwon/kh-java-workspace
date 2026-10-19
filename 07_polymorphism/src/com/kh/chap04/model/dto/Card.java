package com.kh.chap04.model.dto;

public class Card implements Payment{
    private int money = 50000;

    @Override
    public int pay(int amount) {
        System.out.println("카드로 결제합니다");
        money -= (amount * 0.9);
        System.out.println("잔액 : " + money);
        return money;
    }
}
