package com.shop.dao;

import com.shop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by adavi on 25.09.2017.
 */
public interface UserDAO extends JpaRepository<User, Integer> {

    @Query("select user from User user where user.name=:name")
    User findUserByName(@Param("name") String name);
}
