package com.shop.dao;

import com.shop.entety.Dress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by adavi on 25.09.2017.
 */
public interface DressDAO extends JpaRepository<Dress, Integer> {
   @Query("select dress from Dress dress where dress.name=:name")
    Dress findBYName(@Param("name") String name);
}
