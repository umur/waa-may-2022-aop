package com.project.spring.service;

import com.project.spring.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    List<Category> getAll();

    void save(Category category);
}
