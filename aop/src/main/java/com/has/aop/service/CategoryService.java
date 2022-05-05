package com.has.aop.service;


import com.has.aop.dto.CategoryDto;
import com.has.aop.entity.Category;

import java.util.List;

public interface CategoryService {
    void save(Category p);

    void delete(int id);

    CategoryDto getById(int id);

    List<CategoryDto> getAll();
}
