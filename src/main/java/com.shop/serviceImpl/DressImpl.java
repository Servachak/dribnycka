package com.shop.serviceImpl;

import com.shop.dao.DressDAO;
import com.shop.entety.Dress;
import com.shop.service.DressService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by adavi on 25.09.2017.
 */
public class DressImpl implements DressService {

    @Autowired
    private DressDAO dressDAO;

    @Override
    public void save(Dress dress) throws Exception{
        dressDAO.save(dress);
    }

    @Override
    public List<Dress> findAll() {
        return dressDAO.findAll();
    }

    @Override
    public Dress findOne(int id) {
        return dressDAO.findOne(id);
    }

    @Override
    public void delete(int id) {
        dressDAO.delete(id);

    }

    @Override
    public void update(Dress dress) throws Exception {
        dressDAO.save(dress);

    }

    @Override
    public Dress findByName(String name) {
        return dressDAO.findBYName(name);
    }
}
