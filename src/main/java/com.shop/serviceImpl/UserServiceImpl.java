package com.shop.serviceImpl;

import com.shop.dao.UserDAO;
import com.shop.entity.Role;
import com.shop.entity.User;
import com.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by adavi on 25.09.2017.
 */
@Service("userDetailsService")
public class UserServiceImpl implements UserService,UserDetailsService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Override
    public void save(User user) throws Exception {
        user.setRole(Role.ROLE_USER);
        user.setPassword(encoder.encode(user.getPassword()));
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

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        return userDAO.findUserByName(name);
    }
}
