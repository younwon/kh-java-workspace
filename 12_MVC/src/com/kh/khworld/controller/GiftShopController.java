package com.kh.khworld.controller;

import com.kh.khworld.model.dto.GiftShop;
import com.kh.khworld.model.service.GiftShopService;

import java.util.List;

public class GiftShopController {
    private GiftShopService gss = new GiftShopService();

    public List<GiftShop> readGiftShop() {
        return gss.readGiftShop();
    }

    public void addGiftShop(String name, String product, String location) {
        GiftShop giftShop = new GiftShop(name, product, location);
        gss.addGiftShop(giftShop);

    }

    public void deleteGiftShop() {
    }

    public void findGiftShop() {
    }
}
