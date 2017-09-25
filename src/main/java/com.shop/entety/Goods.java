package com.shop.entety;

import javax.persistence.MappedSuperclass;

/**
 * Created by adavi on 01.09.2017.
 */@MappedSuperclass
public abstract class Goods {

    private String name;
    private String color;
    private String type;
    private String sex;
    private String size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
