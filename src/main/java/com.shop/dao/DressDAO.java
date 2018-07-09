package com.shop.dao;

import com.shop.entity.Dress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by adavi on 25.09.2017.
 */
public interface DressDAO extends JpaRepository<Dress, Integer> {

   @Query("select dress from Dress dress where dress.name=:name")
    Dress findByName(@Param("name") String name);

   @Query("select color from Color color left join fetch Dress dress where color.id=:id")
    Dress findDressWithColor(@Param("id") int colorId);




}
