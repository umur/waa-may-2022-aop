package edu.miu.springdata.service;

import edu.miu.springdata.DTO.CategoryDto;

import java.util.List;

public interface CategoryService {
    void save(CategoryDto p);
    void deleteById(int id);
    CategoryDto getById(int id);
    List<CategoryDto> getAll();
}
