package com.example.datademo.service;

import com.example.datademo.entity.Category;
import com.example.datademo.entity.Product;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
    public Iterable<Category> getAll();

    public Category getById(int id);

    public void update(Category c, int id);

    public void delete(int id);

    public void save(Category c);
}
