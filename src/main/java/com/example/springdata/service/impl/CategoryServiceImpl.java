package com.example.springdata.service.impl;

import com.example.springdata.dto.AddCategoryDto;
import com.example.springdata.dto.CategoryDto;
import com.example.springdata.dto.ProductDto;
import com.example.springdata.entity.Category;
import com.example.springdata.entity.Product;
import com.example.springdata.repository.CategoryRepository;
import com.example.springdata.service.CategoryService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    public CategoryDto save(AddCategoryDto categoryDto) throws ParseException {
        Category category = categoryRepository.save(convertToEntity(categoryDto));
        return convertToDto(category);
    }

    public void delete(Integer id) {
        categoryRepository.deleteById(id);
    }

    public CategoryDto getById(Integer id) {
        return categoryRepository.findById(id).map(this::convertToDto).orElse(null);
    }

    public List<CategoryDto> getAll() {
        return StreamSupport
                .stream(categoryRepository.findAll().spliterator(), false)
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private CategoryDto convertToDto(Category category) {
        CategoryDto categoryDto = modelMapper.map(category, CategoryDto.class);
        return categoryDto;
    }

    private Category convertToEntity(AddCategoryDto categoryDto) throws ParseException {
        Category category = modelMapper.map(categoryDto, Category.class);
        return category;
    }
}
