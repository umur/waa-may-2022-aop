package com.example.springdata.service;

import com.example.springdata.dto.AddProductDto;
import com.example.springdata.dto.ProductDto;

import java.text.ParseException;
import java.util.List;

public interface ProductService {
    ProductDto save(AddProductDto product) throws ParseException;

    void delete(Integer id);

    ProductDto getById(Integer id);

    List<ProductDto> getAll();

    List<ProductDto> getAllByMinPrice(Double price);

    List<ProductDto> getAllByCategoryNameAndMaxPrice(String c, double price);

    List<ProductDto> getAllByName(String name);

    List<ProductDto> getAllByUserId(int userId);
}
