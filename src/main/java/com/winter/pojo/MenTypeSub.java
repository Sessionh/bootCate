package com.winter.pojo;

import java.util.List;

public class MenTypeSub {
    private int id;
    private String title;
    private List<MenuTypeSubText> menuTypeSubText;

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

    public List<MenuTypeSubText> getMenuTypeSubText() {
        return menuTypeSubText;
    }

    public void setMenuTypeSubText(List<MenuTypeSubText> menuTypeSubText) {
        this.menuTypeSubText = menuTypeSubText;
    }

    @Override
    public String toString() {
        return "MenTypeSub{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", menuTypeSubText=" + menuTypeSubText +
                '}';
    }
}