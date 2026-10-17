package com.kh.chap04.model.dto;

public class Cash implements Payment{
    int money = 50000;

    @Override
    public int pay(int amount) {
        System.out.println("현금으로 결제합니다");
        return money;
    }
}
