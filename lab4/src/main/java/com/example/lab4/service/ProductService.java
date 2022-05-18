package com.example.lab4.service;

import com.example.lab4.dto.ProductDTO;

public interface ProductService {
    void save(ProductDTO productDTO);
    void delete(int id);
    void update(int id, ProductDTO productDTO);
    ProductDTO getById(int id);
}
