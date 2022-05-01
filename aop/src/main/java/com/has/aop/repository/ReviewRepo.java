package com.has.aop.repository;

import com.has.aop.entity.Address;
import com.has.aop.entity.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepo extends CrudRepository<Review,Integer> {
}
