package com.shop.dao;

import com.shop.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by adavi on 05.10.2017.
 */
public interface OrdersDAO extends JpaRepository<Orders, Integer> {
}
