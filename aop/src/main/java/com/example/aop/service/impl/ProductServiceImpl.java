package com.example.aop.service.impl;

import com.example.aop.entity.Product;
import com.example.aop.repo.ProductRepo;
import com.example.aop.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<Product> getAll() {
        return (List<Product>) productRepo.findAll();
    }

    @Override
    public List<Product> filterByPrice(float minPrice, float maxPrice, String name) {
        if (!name.equals("")) {
            return productRepo.findAllByNameContaining(name);
        } else if (minPrice > 0) {
            return productRepo.findAllByPriceGreaterThan(minPrice);
        } else if (maxPrice > 0) {
            return productRepo.findAllByPriceLessThan(maxPrice);
        }
        return new ArrayList<>();
    }

    @Override
    public Optional<Product> getProductById(int id) {
        return productRepo.findById(id);
    }

    @Override
    public void create(Product product) {
        productRepo.save(product);
    }

    @Override
    public void update(Product product, int id) {
        product.setId(id);
        productRepo.save(product);
    }

    @Override
    public void delete(int id) {
        productRepo.deleteById(id);
    }
}
