package com.example.aop.service;

import com.example.aop.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    public List<Category> getCategories();

    public void createCategory(Category category);

    public void updateCategory(Category category, int id);

    public void deleteCategory(int id);
}
