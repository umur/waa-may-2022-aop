package com.has.aop.service;

import com.has.aop.dto.ReviewDto;
import com.has.aop.entity.Address;
import com.has.aop.entity.Review;

import java.util.List;

public interface ReviewService {
    void save(Review p);

    void delete(int id);

    ReviewDto getById(int id);

    List<ReviewDto> getAll();
}
