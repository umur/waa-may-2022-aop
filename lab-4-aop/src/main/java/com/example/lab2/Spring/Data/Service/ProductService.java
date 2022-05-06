package com.example.lab2.Spring.Data.Service;

import com.example.lab2.Spring.Data.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public List<Product> getAll();

    public  List<Product> filterByPrice(float minPrice, float maxPrice, String name);

    public Optional<Product> getProductById(int id);

    public void create(Product product);

    public void update(Product product, int id);

    public void delete(int id);
}
