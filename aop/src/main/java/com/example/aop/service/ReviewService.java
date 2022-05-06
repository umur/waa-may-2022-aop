package com.example.aop.service;

import com.example.aop.entity.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getAll();

    void create(Review review);

    void update(Review review, int id);

    void delete(int id);
}
