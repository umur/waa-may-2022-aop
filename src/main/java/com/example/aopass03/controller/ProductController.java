package com.example.aopass03.controller;

import com.example.aopass03.dto.ProductDto;
import com.example.aopass03.service.ProductService;
import com.example.aopass03.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {
    ProductService productService;

    @GetMapping
    public List<ProductDto> getAll(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ProductDto getById(@PathVariable int id){
        return productService.findById(id);
    }

    @PostMapping
    public ProductDto save(@RequestBody ProductDto user){
        return productService.save(user);
    }

    @PutMapping("/{id}")
    public ProductDto update(@RequestBody ProductDto user, int id){
        return productService.update(user, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        productService.remove(id);
    }

}
