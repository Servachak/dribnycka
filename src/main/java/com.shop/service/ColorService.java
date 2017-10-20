package com.shop.service;

import com.shop.entity.Color;

import java.util.List;

/**
 * Created by adavi on 20.10.2017.
 */
public interface ColorService {

    void save(Color coloName);

    List<Color> findAll();

    Color findOne(int id);

    void delete(int id);

    void update(Color colorName);
}
