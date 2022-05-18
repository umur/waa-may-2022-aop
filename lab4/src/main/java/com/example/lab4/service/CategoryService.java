package com.example.lab4.service;

import com.example.lab4.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    void save(CategoryDTO categoryDTO);
    void delete(int id);
    void update(int id, CategoryDTO categoryDTO);
    CategoryDTO getById(int id);
    List<CategoryDTO> getAll();
}
