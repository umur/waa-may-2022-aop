package edu.miu.springdata.service;

import edu.miu.springdata.DTO.ReviewDto;

import java.util.List;

public interface ReviewService {
    void save(ReviewDto p);
    void deleteById(int id);
    ReviewDto getById(int id);
    List<ReviewDto> getAll();
}
