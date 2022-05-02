package edu.miu.springaop.repository;

import edu.miu.springaop.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends CrudRepository<Review, Integer> {
}
