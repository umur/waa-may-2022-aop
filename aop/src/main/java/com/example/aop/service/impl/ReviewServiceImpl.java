package com.example.aop.service.impl;

import com.example.aop.entity.Review;
import com.example.aop.repo.ReviewRepo;
import com.example.aop.service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepo reviewRepo;

    public ReviewServiceImpl(ReviewRepo reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    @Override
    public List<Review> getAll() {
        return (List<Review>) reviewRepo.findAll();
    }

    @Override
    public void create(Review review) {
        reviewRepo.save(review);
    }

    @Override
    public void update(Review review, int id) {
        review.setId(id);
        reviewRepo.save(review);
    }

    @Override
    public void delete(int id) {
        reviewRepo.deleteById(id);
    }
}
