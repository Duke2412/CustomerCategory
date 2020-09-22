package com.codegym.cms.service.impl;

import com.codegym.cms.model. Category;
import com.codegym.cms.repository. CategoryRepository;
import com.codegym.cms.service. CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

public class  CategoryServiceImpl implements  CategoryService {

    @Autowired
    private  CategoryRepository  CategoryRepository;

    @Override
    public Iterable< Category> findAll() {
        return  CategoryRepository.findAll();
    }

    @Override
    public  Category findById(Long id) {
        return  CategoryRepository.findOne(id);
    }

    @Override
    public void save( Category category) {
        CategoryRepository.save(category);
    }

    @Override
    public void remove(Long id) {
        CategoryRepository.delete(id);
    }
}
