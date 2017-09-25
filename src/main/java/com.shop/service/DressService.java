package com.shop.service;

import com.shop.entety.Dress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by adavi on 25.09.2017.
 */
@Service
public interface DressService {

    void save(Dress dress) throws Exception;

    List<Dress> findAll();

    Dress findOne(int id);

    void delete(int id);

    void update(Dress dress) throws Exception;

    Dress findByName(String name);

//    Page<Dress> findAllPages(Pageable pageable);
}
