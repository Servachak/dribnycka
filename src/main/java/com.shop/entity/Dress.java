package com.shop.entity;

import javax.persistence.*;

/**
 * Created by adavi on 01.09.2017.
 */


@Entity
public class Dress extends Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;



    @ManyToOne()
     private User user;

    @ManyToOne()
    private Orders orders;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dress() {
    }

    public Dress(String name, String color, String type, String sex, String size) {
        super(name, color, type, sex, size);
    }

    @Override
    public String toString() {
        return "Dress{}";
    }
}
