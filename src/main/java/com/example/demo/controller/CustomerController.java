package com.example.demo.controller;

import com.example.demo.entity.bidirect.Customer;
import com.example.demo.entity.bidirect.Product;
import com.example.demo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Column;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class CustomerController {
  private final   CustomerService customerService;
   @GetMapping("/customer/{id}/products")
    public List<Product> findByIdReviewsProduct(@PathVariable int id) {
            return customerService.findByIdProductsByReviewsProduct(id);
        }
}
