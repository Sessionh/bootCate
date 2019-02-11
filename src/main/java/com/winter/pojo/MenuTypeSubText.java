package com.winter.pojo;

public class MenuTypeSubText {
    private int id;
    private String name;
    private int uId;

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

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    @Override
    public String toString() {
        return "MenuTypeSubText{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", uId=" + uId +
                '}';
    }
}
