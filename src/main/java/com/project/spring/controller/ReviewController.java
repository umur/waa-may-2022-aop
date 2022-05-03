package com.project.spring.controller;

import com.project.spring.entity.Review;
import com.project.spring.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/review")
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public List<Review> getAll() {
        return reviewService.getAll();
    }

    @PostMapping
    public void save(@RequestBody Review review) {
        reviewService.save(review);
    }

}
