package com.kh.khworld.model.service;

import com.kh.khworld.exception.DuplicateNameException;
import com.kh.khworld.model.dto.GiftShop;

import java.util.ArrayList;
import java.util.List;

public class GiftShopService {
    private List<GiftShop> giftShopList = new ArrayList<>();

    {
        //초기화 메소드
        giftShopList.add(new GiftShop("무기와라 스토어", "원피스 IP 오리지널 상품, 이치방쿠지 키오스크", "쇼핑몰 B1층 로티로리광장"));
        giftShopList.add(new GiftShop("콩X고질라 더 라이드 SHOP", "콩X고질라 IP 헤어밴드, 가방 등 굿즈", "콩X고질라 더 라이드 어트랙션 출구"));
        giftShopList.add(new GiftShop("아트박스", "문구, 잡화류, IP상품", "쇼핑몰 B1층 로티로리광장"));
    }

    public List<GiftShop> readGiftShop() {
        return giftShopList;

    }

    public void addGiftShop(GiftShop giftShop) {
        try{
            checkName(giftShop.getName());
        } catch (DuplicateNameException e) {
            System.out.println(e.getMessage());
        }
        checkName(giftShop.getName());

        giftShopList.add(giftShop);

    }

    public void deleteGiftShop(String name) {
        for (int i = 0; i < giftShopList.size(); i++) {
            if (name.equals(giftShopList.get(i).getName())){
                giftShopList.remove(i);
                break;
            }
        }
    }

    public List<String> findGiftShop(String keyword) {
        List<String> keywordList = new ArrayList<>();
        for (GiftShop giftShop : giftShopList) {
            if (giftShop.getName().contains(keyword)) {
                keywordList.add(giftShop.getName());
            }
        }
        return keywordList;
    }

    private void checkName(String name){
        for (GiftShop giftShop : giftShopList){
            if (giftShop.getName().equals(name)){
                throw new DuplicateNameException("같은 이름의 기프트샵이 이미 존재함");
            }
        }
    }
}
