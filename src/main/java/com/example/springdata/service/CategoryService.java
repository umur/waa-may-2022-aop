package com.example.springdata.service;

import com.example.springdata.dto.AddCategoryDto;
import com.example.springdata.dto.CategoryDto;
import com.example.springdata.entity.Category;

import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public interface CategoryService {
    public CategoryDto save(AddCategoryDto category) throws ParseException;

    public void delete(Integer id);

    public CategoryDto getById(Integer id);

    public List<CategoryDto> getAll();
}
