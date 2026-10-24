package com.kh.khworld.model.dto;

public class GiftShop {
    private String name;
    private String product;
    private String location;

    public GiftShop(String name, String product, String location) {
        this.name = name;
        this.product = product;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "GiftShop{" +
                "name='" + name + '\'' +
                ", menu='" + product + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
