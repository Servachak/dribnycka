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

    @OneToMany(mappedBy = "dress")
    private List<Color> listColorName = new ArrayList<>();

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

    public Dress(String name, String type, String sex, String size) {
        super(name, type, sex, size);

    }

    @Override
    public String toString() {
        return "Dress{}";
    }
}
