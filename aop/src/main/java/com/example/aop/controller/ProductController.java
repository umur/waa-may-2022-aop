package com.example.aop.controller;

import com.example.aop.aspect.annotation.ExecutionTime;
import com.example.aop.aspect.annotation.Logger;
import com.example.aop.entity.Product;
import com.example.aop.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @Logger
    @ExecutionTime
    @GetMapping()
    public List<Product> getAll() {
        return productService.getAll();
    }

    @Logger
    @ExecutionTime
    @GetMapping(value = "/filter")
    public List<Product> filterByPrice(@RequestParam(defaultValue = "0.0", name = "minPrice") float minPrice,
                                       @RequestParam(defaultValue = "0.0", name = "maxPrice") float maxPrice,
                                       @RequestParam(defaultValue = "", name="name") String name) {
        return productService.filterByPrice(minPrice, maxPrice, name);
    }

    @Logger
    @ExecutionTime
    @GetMapping(value = "/{id}")
    public Optional<Product> getProductsById(@PathVariable("id") int id) {
        return productService.getProductById(id);
    }

    @Logger
    @ExecutionTime
    @PostMapping()
    public void create(@RequestBody Product product) {
        productService.create(product);
    }

    @Logger
    @ExecutionTime
    @PutMapping(value="/{id}")
    public void update(@RequestBody Product product, @PathVariable int id) {
        productService.update(product, id);
    }

    @Logger
    @ExecutionTime
    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable int id) {
        productService.delete(id);
    }
}
