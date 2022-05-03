package com.example.demo.repository;


import com.example.demo.entity.bidirect.Product;
import com.example.demo.entity.bidirect.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product,Integer> {

    public List<Product> findAllByPriceGreaterThan(double price);
    public List<Product> findAllByPriceLessThan(double price);
    public List<Product> findAllByCategoryIdAndPriceLessThan(int categoryId,double price);
    public List<Product> findAllByNameContaining(String name);

    public List<Product>  getByReviewsCustomerId(int customerId);
    public Product  getById(int productId);
}
