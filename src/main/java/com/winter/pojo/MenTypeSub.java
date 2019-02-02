package com.winter.pojo;

public class MenTypeSub {
    private int id;
    private String name;
    private int menuTypeId;

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

    public int getMenuTypeId() {
        return menuTypeId;
    }

    public void setMenuTypeId(int menuTypeId) {
        this.menuTypeId = menuTypeId;
    }

    @Override
    public String toString() {
        return "MenTypeSub{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", menuTypeId=" + menuTypeId +
                '}';
    }
}
