package com.shop.service;

import com.shop.entity.Orders;

import java.util.List;

/**
 * Created by adavi on 05.10.2017.
 */
public interface OrdersService  {
    void save(Orders orders);

    List<Orders> findOll();

    Orders findOne(int id);

    void delete(int id);

    void update(int id);



}
