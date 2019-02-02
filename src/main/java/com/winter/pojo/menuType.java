package com.winter.pojo;

public class menuType {
    private int id;
    private String name;
    private int subId;

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

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    @Override
    public String toString() {
        return "menuType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subId=" + subId +
                '}';
    }
}
