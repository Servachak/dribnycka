package com.shop.dao;

import com.shop.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by adavi on 20.10.2017.
 */
public interface ColorDAO extends JpaRepository<Color, Integer> {



}
