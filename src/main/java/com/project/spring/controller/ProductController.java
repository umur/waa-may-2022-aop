package com.project.spring.controller;

import com.project.spring.entity.Product;
import com.project.spring.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("/cost/{price}")
    public List<Product> getProductsMoreThan(@PathVariable String price) {
        return productService.getProductsMoreThan(price);
    }

    @GetMapping("/category/{category}/cost/{price}")
    public List<Product> getProductsByCategoryAndPriceLessThan
            (@PathVariable String category, @PathVariable String price) {
        return productService.getProductsByCategoryAndPriceLessThan(category, price);
    }

    @GetMapping("/name")
    @ResponseBody
    public List<Product> getProductsByKeyword(@RequestParam String keyword) {
        return productService.getProductsContainingKeyword(keyword);
    }

    @PostMapping
    public void save(@RequestBody Product product) {
        productService.save(product);
    }
}
