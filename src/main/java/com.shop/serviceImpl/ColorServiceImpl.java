package com.shop.serviceImpl;

import com.shop.dao.ColorDAO;
import com.shop.entity.Color;
import com.shop.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by adavi on 20.10.2017.
 */
@Service
public class ColorServiceImpl implements ColorService {
    @Autowired
    private ColorDAO colorDAO;

    @Override
    public void save(Color coloName) {
        colorDAO.save(coloName);
    }

    @Override
    public List<Color> findAll() {
        return colorDAO.findAll();
    }

    @Override
    public Color findOne(int id) {
        return colorDAO.findOne(id);
    }

    @Override
    public void delete(int id) {
        colorDAO.delete(id);

    }

    @Override
    public void update(Color colorName) {

        colorDAO.save(colorName);
    }
}
