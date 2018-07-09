package com.shop.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by adavi on 20.10.2017.
 */
@Entity
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String colorName;

    @OneToMany(mappedBy = "color")
    private List<Dress> dressList = new ArrayList<>();



    public Color() {

    }

    public List<Dress> getDressList() {
        return dressList;
    }

    public void setDressList(List<Dress> dressList) {
        this.dressList = dressList;
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
