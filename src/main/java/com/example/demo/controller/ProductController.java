package com.example.demo.controller;

import com.example.demo.aspect.annontation.LogMe;
import com.example.demo.entity.bidirect.Product;
import com.example.demo.entity.bidirect.Review;
import com.example.demo.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService productService;
@LogMe
    @GetMapping("/all")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping
    public List<Product> findAllProductsPrice(@RequestParam(defaultValue = "0", name = "minprice") double minprice, @RequestParam(defaultValue = "0", name = "maxprice") double maxprice, @RequestParam(defaultValue = "", name = "name") String name) {
        if (minprice > 0) {
            System.out.println("in");
            return productService.findAllByPriceGreaterThan(minprice);
        } else if (maxprice > 0) {
            return productService.findAllByPriceLessThan(maxprice);
        } else if (!name.equals("")) {
            return productService.findAllByNameContaining(name);
        } else
            return null;
    }

    @GetMapping("/users/{id}")
    public List<Product> getProductsByCustomerId(@PathVariable int id) {
        return productService.getProductsByCustomerId(id);
    }
    @GetMapping("/{id}/reviews")
    public List<Review> getReviewsById(@PathVariable int id) {
        return productService.getAllReviewsById(id);
    }
}

