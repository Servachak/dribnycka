package com.shop.entity;

import javax.persistence.MappedSuperclass;

/**
 * Created by adavi on 01.09.2017.
 */
@MappedSuperclass
public class Goods {

    private String name;
    private String type;
    private String sex;
    private String size;

    public Goods() {
    }

    public Goods(String name,String type, String sex, String size) {
        this.name = name;
        this.type = type;
        this.sex = sex;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", sex='" + sex + '\'' +
                ", size='" + size + '\'' +
                '}';
    }


}
