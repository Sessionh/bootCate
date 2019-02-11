package com.winter.pojo;

import java.util.List;

public class MenuType {
    private int id;
    private String name;
    private List<MenuTypeSubText> subId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MenuTypeSubText> getSubId() {
        return subId;
    }

    public void setSubId(List<MenuTypeSubText> subId) {
        this.subId = subId;
    }

    @Override
    public String toString() {
        return "MenuType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subId=" + subId +
                '}';
    }
}
