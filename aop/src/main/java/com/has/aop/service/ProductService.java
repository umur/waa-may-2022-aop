package com.has.aop.service;

import com.has.aop.dto.ProductDto;
import com.has.aop.entity.Product;

import java.util.List;

public interface ProductService {
    void save(Product p);

    void delete(int id);

    ProductDto getById(int id);

    List<ProductDto> getAll();
}
