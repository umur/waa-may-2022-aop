package com.example.springdata.repository;

import com.example.springdata.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findAllByPriceGreaterThan(Double price);

    List<Product> findAllByCategoryNameAndPriceLessThan(String c, double price);

    List<Product> findByNameContaining(@Param("name") String n);

    List<Product> findByCreatedById(@Param("created_by_id") int userId);
}
