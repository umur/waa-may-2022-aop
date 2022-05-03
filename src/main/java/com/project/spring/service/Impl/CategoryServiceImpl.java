package com.project.spring.service.Impl;

import com.project.spring.entity.Category;
import com.project.spring.repository.CategoryRepository;
import com.project.spring.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getAll() {
        var entity = categoryRepository.findAll();

        var result = new ArrayList<Category>();

        entity.forEach(c -> {
            Category category = new Category();
            category.setId(c.getId());
            category.setName(c.getName());
            result.add(category);
        });
        return result;
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }
}
