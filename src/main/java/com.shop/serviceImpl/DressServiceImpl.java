package com.shop.serviceImpl;

import com.shop.dao.ColorDAO;
import com.shop.dao.DressDAO;
import com.shop.entity.Color;
import com.shop.entity.Dress;
import com.shop.service.DressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by adavi on 25.09.2017.
 */
@Service
public class DressServiceImpl implements DressService {

    @Autowired
    private DressDAO dressDAO;
    @Autowired
    private ColorDAO colorDAO;

    @Override
    public void save(Dress dress, int colorId) throws Exception{

        Color color = colorDAO.findOne(colorId);

        dressDAO.saveAndFlush(dress);

        dress.setColor(color);

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
        return dressDAO.findByName(name);
    }

    public Dress findDressWithColor(int id){
        return dressDAO.findDressWithColor(id);
    }



}
