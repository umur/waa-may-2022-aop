package com.shop.association.service.impl;

import com.shop.association.domain.Product;
import com.shop.association.repository.ProductRepo;
import com.shop.association.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    @Override
    public void save(Product product) {
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

    @Override
    public List<Product> getAll() {
        return (List<Product>) productRepo.findAll();
    }

    @Override
    public Product getById(int id) {
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public List<Product> priceMoreThanMinPrice(double minPrice) {
        return productRepo.findAllByPriceGreaterThan(minPrice);
    }

    @Override
    public List<Product> productInCatPriceLessThanMaxPrice(String categoryName, double maxPrice) {
        return productRepo.findAllByCategoryNameAndPriceLessThan(categoryName, maxPrice);
    }
}
