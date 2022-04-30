package edu.miu.springaop.service;

import edu.miu.springaop.DTO.ProductDto;
import edu.miu.springaop.DTO.ReviewDto;

import java.util.List;

public interface ProductService {

    void save(ProductDto p);
    void deleteById(int id);
    ProductDto getById(int id);
    List<ProductDto> getAll();

    List<ProductDto> findByPriceGreaterThan(float price);
    List<ProductDto> findByCategoryAndPriceLessThan(String Category, float price);
    List<ProductDto> findByNameContaining(String name);

    List<ReviewDto> getReviewByProductId(int id);

}
