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


}
