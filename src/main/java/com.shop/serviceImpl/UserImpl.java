package com.shop.serviceImpl;

import com.shop.dao.UserDAO;
import com.shop.entety.User;
import com.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by adavi on 25.09.2017.
 */
public class UserImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void save(User user) throws Exception {
        userDAO.save(user);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public User findOne(int id) {
        return userDAO.findOne(id);
    }

    @Override
    public void delete(int id) {
        userDAO.delete(id);

    }

    @Override
    public void update(User user) throws Exception {

        userDAO.save(user);
    }

    @Override
    public User findByName(String name) {
        return userDAO.findUserByName(name);
    }
}
