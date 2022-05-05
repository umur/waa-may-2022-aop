package com.has.aop.controller;



import com.has.aop.aspect.annotation.ActivityLog;
import com.has.aop.aspect.annotation.ExecutionTime;
import com.has.aop.dto.ProductDto;
import com.has.aop.entity.Product;
import com.has.aop.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @PostMapping
    public void save(@RequestBody Product p) {
        productService.save(p);
    }
    @DeleteMapping
    public void deleteById(@RequestParam int p) {
        productService.delete(p);
    }
    @GetMapping
    @ExecutionTime
    public List<ProductDto> getAll() {
        return productService.getAll();
    }
    @GetMapping("/{id}")
    public ProductDto getById(@RequestParam int id) {
        return productService.getById(id);
    }


}
