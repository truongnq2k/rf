package com.example.myapplication.models;

import java.util.List;

public class User {
    private String userName;
    private String password;
    private String fullName;
    private String email;
    private List<Store> listStores;
    private UserType type;

    public User(String userName, String fullName) {
        this.userName = userName;
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Store> getListStores() {
        return listStores;
    }

    public void setListStores(List<Store> listStores) {
        this.listStores = listStores;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }
}
