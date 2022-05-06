package com.example.aop.service;
import com.example.aop.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> getAll();

    List<Product> filterByPrice(float minPrice, float maxPrice, String name);

    Optional<Product> getProductById(int id);

    void create(Product product);

    void update(Product product, int id);

    void delete(int id);
}
