package com.shop.entity;

import javax.persistence.MappedSuperclass;

/**
 * Created by adavi on 01.09.2017.
 */
@MappedSuperclass
public class Goods {

    private String name;
    private String color;
    private String type;
    private String sex;
    private String size;

    public Goods() {
    }

    public Goods(String name, String color, String type, String sex, String size) {
        this.name = name;
        this.color = color;
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

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", sex='" + sex + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Goods)) return false;

        Goods goods = (Goods) o;

        if (getName() != null ? !getName().equals(goods.getName()) : goods.getName() != null) return false;
        if (getColor() != null ? !getColor().equals(goods.getColor()) : goods.getColor() != null) return false;
        if (getType() != null ? !getType().equals(goods.getType()) : goods.getType() != null) return false;
        if (getSex() != null ? !getSex().equals(goods.getSex()) : goods.getSex() != null) return false;
        return getSize() != null ? getSize().equals(goods.getSize()) : goods.getSize() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getSex() != null ? getSex().hashCode() : 0);
        result = 31 * result + (getSize() != null ? getSize().hashCode() : 0);
        return result;
    }
}
