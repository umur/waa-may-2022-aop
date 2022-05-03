package com.example.demo.service;


import com.example.demo.entity.bidirect.Product;
import com.example.demo.entity.bidirect.Review;
import com.example.demo.repository.ProductRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;

    public List<Product> findAll(){
        var result= new ArrayList<Product>();
        productRepo.findAll().forEach(result::add);
        return result;
          }
    public List<Product> findAllByPriceGreaterThan(double price){
        return productRepo.findAllByPriceGreaterThan(price);
    }
    public List<Product> findAllByPriceLessThan(double price){
        return productRepo.findAllByPriceLessThan(price);
    }
    public List<Product> findAllByCategoryIdAndPriceLessThan(int categoryid,double price){
        return productRepo.findAllByCategoryIdAndPriceLessThan(categoryid,price);
    }
    public List<Product> findAllByNameContaining(String name){
        return productRepo.findAllByNameContaining(name);
    }
    public List<Product> getProductsByCustomerId(int customerId){
        return productRepo.getByReviewsCustomerId(customerId);
    }
    public List<Review> getAllReviewsById(int customerId){
        return productRepo.getById(customerId).getReviews();
    }
}
