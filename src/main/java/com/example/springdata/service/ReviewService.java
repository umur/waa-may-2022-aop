package com.example.springdata.service;

import com.example.springdata.dto.ReviewDto;
import com.example.springdata.entity.Review;

import java.util.List;

public interface ReviewService {
    public Review save(Review review);

    public void delete(Integer id);

    public Review getById(Integer id);

    public List<Review> getAll();

    List<ReviewDto> getAllByProductIdAndUserId(int productId, int userId);

    List<ReviewDto> getAllJPQLByProductIdAndUserId(int productId, int userId);
}
