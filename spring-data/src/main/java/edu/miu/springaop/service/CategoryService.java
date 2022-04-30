package edu.miu.springaop.service;

import edu.miu.springaop.DTO.CategoryDto;

import java.util.List;

public interface CategoryService {
    void save(CategoryDto p);
    void deleteById(int id);
    CategoryDto getById(int id);
    List<CategoryDto> getAll();
}
