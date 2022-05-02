package edu.miu.springaop.repository;

import edu.miu.springaop.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

    List<Product> findByPriceGreaterThan(float price);
    List<Product> findByCategoryAndPriceLessThan(String category, float price);
    List<Product> findByNameContaining(String name);


}
