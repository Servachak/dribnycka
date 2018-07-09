package com.shop.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by adavi on 01.09.2017.
 */


@Entity
public class Dress extends Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @ManyToOne
    private Color color;

    @ManyToOne()
    private User user;

    @ManyToOne()
    private Orders orders;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dress() {
    }

    public Dress(String name, String type, String sex, String size) {
        super(name, type, sex, size);

    }

    @Override
    public String toString() {
        return "Dress{}";
    }
}
