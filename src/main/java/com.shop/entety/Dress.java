package com.shop.entety;

import javax.persistence.*;

/**
 * Created by adavi on 01.09.2017.
 */@Entity
@Table(name = "Плаття")
public class Dress extends Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne
    private User user = new User();

    public Dress() {
    }







}
