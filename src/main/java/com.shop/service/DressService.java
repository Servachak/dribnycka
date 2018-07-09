package com.shop.service;

import com.shop.entity.Dress;


import java.util.List;

/**
 * Created by adavi on 25.09.2017.
 */

public interface DressService {

    void save(Dress dress, int color) throws Exception;

    List<Dress> findAll();

    Dress findOne(int id);

    void delete(int id);

    void update(Dress dress) throws Exception;

    Dress findByName(String name);

    Dress findDressWithColor(int colorId);



//    Page<Dress> findAllPages(Pageable pageable);
}
