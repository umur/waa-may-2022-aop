package com.example.datademo.repository;

import com.example.datademo.entity.Product;
import com.example.datademo.entity.Review;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {
    public List<Review> findAllByProduct(Product p);

    @Query(value="SELECT * FROM reviews WHERE product_id=?1",nativeQuery = true)
    public List<Review> findAllByProductID(int p);
}
