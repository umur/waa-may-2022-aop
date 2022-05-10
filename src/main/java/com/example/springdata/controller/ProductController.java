package com.example.springdata.controller;

import com.example.springdata.dto.AddProductDto;
import com.example.springdata.dto.ProductDto;
import com.example.springdata.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/products")
@AllArgsConstructor
@CrossOrigin
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductDto>> findProducts(@RequestParam Map<String, String> params) {
        if (params.containsKey("minPrice")) {
            Double minPrice = Double.valueOf(params.get("minPrice"));
            return ResponseEntity.ok(productService.getAllByMinPrice(minPrice));
        } else if (params.containsKey("maxPrice") && params.containsKey("categoryName")) {
            Double maxPrice = Double.valueOf(params.get("maxPrice"));
            String categoryName = params.get("categoryName");
            return ResponseEntity.ok(productService.getAllByCategoryNameAndMaxPrice(categoryName, maxPrice));
        } else if (params.containsKey("name")) {
            String name = params.get("name");
            return ResponseEntity.ok(productService.getAllByName(name));
        }

        return ResponseEntity.ok(productService.getAll());
    }

    @PostMapping
    public ResponseEntity<ProductDto> save(@RequestBody AddProductDto productDto) throws ParseException {
        return ResponseEntity.ok(productService.save(productDto));
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<ProductDto>> findByUserId(@PathVariable int userId) {
        return ResponseEntity.ok(productService.getAllByUserId(userId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> findById(@PathVariable int id) {
        return ResponseEntity.ok(productService.getById(id));
    }

}
