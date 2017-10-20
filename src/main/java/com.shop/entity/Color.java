package com.shop.entity;

import javax.persistence.*;

/**
 * Created by adavi on 20.10.2017.
 */
@Entity
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String colorName;
    @ManyToOne
    private Dress dress;

    public Dress getDress() {
        return dress;
    }

    public void setDress(Dress dress) {
        this.dress = dress;
    }

    public Color() {

    }

    public Color(String colorName) {
        this.colorName = colorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}
