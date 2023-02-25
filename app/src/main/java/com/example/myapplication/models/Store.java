package com.example.myapplication.models;

import java.util.List;

public class Store {
    private String storeName;
    private String address;
    private List<Food> listFoods;

    public Store(String storeName, String address) {
        this.storeName = storeName;
        this.address = address;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Food> getListFoods() {
        return listFoods;
    }

    public void setListFoods(List<Food> listFoods) {
        this.listFoods = listFoods;
    }
}
