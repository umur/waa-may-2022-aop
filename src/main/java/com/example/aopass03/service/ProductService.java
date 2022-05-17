package com.example.aopass03.service;

import com.example.aopass03.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> findAll();
    ProductDto findById(int id);
    ProductDto save(ProductDto product);
    ProductDto update(ProductDto product, int id);
    void remove(int id);
}
