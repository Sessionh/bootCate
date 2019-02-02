package com.winter.model;

public class menuTypeSubText {
    private int id;
    private String title;
    private int uId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    @Override
    public String toString() {
        return "menuTypeSubText{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", uId=" + uId +
                '}';
    }
}
