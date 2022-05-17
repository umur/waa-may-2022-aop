package com.example.aopass03.service;

import com.example.aopass03.dto.ReviewDto;

import java.util.List;

public interface ReviewService {
    List<ReviewDto> findAll();
    ReviewDto findById(int id);
    ReviewDto save(ReviewDto review);
    ReviewDto update(ReviewDto review, int id);
    void remove(int id);
}
