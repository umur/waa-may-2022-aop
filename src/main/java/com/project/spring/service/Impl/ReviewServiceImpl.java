package com.project.spring.service.Impl;

import com.project.spring.entity.Review;
import com.project.spring.repository.ReviewRepository;
import com.project.spring.service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> getAll() {
        var entity = reviewRepository.findAll();

        var result = new ArrayList<Review>();
        entity.forEach(r -> {
            Review review = new Review();
            review.setId(r.getId());
            review.setComment(r.getComment());
            review.setUser(r.getUser());

            result.add(review);
        });
        return result;
    }

    @Override
    public void save(Review review) {
        reviewRepository.save(review);
    }
}
