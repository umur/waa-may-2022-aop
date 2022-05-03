package com.project.spring.service;

import com.project.spring.entity.Review;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReviewService {

    List<Review> getAll();

    void save(Review review);
}
