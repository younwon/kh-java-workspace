package com.kh.khworld.model.dto;

public class Restaurant {
    private String name;
    private String menu;
    private String location;

    public Restaurant(String name, String menu, String location) {
        this.name = name;
        this.menu = menu;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", product='" + menu + '\'' +
                ", Hours='" + location + '\'' +
                '}';
    }
}
