package com.example.demo.controller;

import com.example.demo.aspect.annontation.LogMe;
import com.example.demo.entity.bidirect.Product;
import com.example.demo.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/categories")
public class CategoryController {

    private  final ProductService productService;
@LogMe
    @GetMapping("/{id}/products")
    public List<Product> findProductswithPrice(@PathVariable int id, @RequestParam(defaultValue = "0",name = "maxprice") double maxprice){
      return   productService.findAllByCategoryIdAndPriceLessThan(id,maxprice);
    }
}
