package com.project.spring.repository;

import com.project.spring.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findAllByPriceGreaterThan(float price);

    List<Product> findAllByCategory_NameEqualsAndPriceLessThan(String category, float price);

    List<Product> findAllByNameContains(String keyword);

}
