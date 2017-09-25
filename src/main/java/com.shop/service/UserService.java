package com.shop.service;

import com.shop.entety.User;

import java.util.List;

/**
 * Created by adavi on 25.09.2017.
 */
public interface UserService {
    void save(User user) throws Exception;

    List<User> findAll();

    User findOne(int id);

    void delete(int id);

    void update(User user) throws Exception;

    User findByName(String name);

//    Page<Dress> findAllPages(Pageable pageable);
}
