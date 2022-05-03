package com.project.spring.service;

import com.project.spring.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> getAll();

    void save(Product product);

    List<Product> getProductsMoreThan(String price);

    List<Product> getProductsByCategoryAndPriceLessThan(String name, String price);

    List<Product> getProductsContainingKeyword(String keyword);
}
