package com.project.spring.service.Impl;

import com.project.spring.entity.Product;
import com.project.spring.repository.ProductRepository;
import com.project.spring.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        var entity = productRepository.findAll();

        var result = new ArrayList<Product>();

       // entity.forEach(result::add);

        entity.forEach(p -> {
            Product product = new Product();
            product.setId(p.getId());
            product.setName(p.getName());
            product.setPrice(p.getPrice());
            product.setRating(p.getRating());
            product.setCategory(p.getCategory());

            result.add(product);

        });

        return result;
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> getProductsMoreThan(String price) {
        float p = Float.parseFloat(price);
        return productRepository.findAllByPriceGreaterThan(p);
    }

    @Override
    public List<Product> getProductsByCategoryAndPriceLessThan(String name, String price) {
        float p = Float.parseFloat(price);
        return productRepository.findAllByCategory_NameEqualsAndPriceLessThan(name, p);
    }

    @Override
    public List<Product> getProductsContainingKeyword(String keyword) {
        String k = keyword;
        System.err.println("************* " + k);
        return productRepository.findAllByNameContains(k);
    }
}
