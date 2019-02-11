package com.winter.pojo;

import java.util.List;

public class MenuType {
    private int id;
    private String name;
    private List<MenuTypeSubText> subs;

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

    public List<MenuTypeSubText> getSubs() {
        return subs;
    }

    public void setSubs(List<MenuTypeSubText> subs) {
        this.subs = subs;
    }

    @Override
    public String toString() {
        return "MenuType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subs=" + subs +
                '}';
    }
}
