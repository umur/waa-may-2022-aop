package com.example.springdata.service.impl;

import com.example.springdata.dto.AddUserDto;
import com.example.springdata.dto.ReviewDto;
import com.example.springdata.dto.UserDto;
import com.example.springdata.entity.Review;
import com.example.springdata.entity.User;
import com.example.springdata.repository.ReviewRepository;
import com.example.springdata.service.ReviewService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private ReviewRepository reviewRepository;

    private final ModelMapper modelMapper;

    public Review save(Review review) {
        return reviewRepository.save(review);
    }

    public void delete(Integer id) {
        reviewRepository.deleteById(id);
    }

    public Review getById(Integer id) {
        return reviewRepository.findById(id).orElse(null);
    }

    public List<Review> getAll() {
        return StreamSupport
                .stream(reviewRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public List<ReviewDto> getAllByProductIdAndUserId(int productId, int userId) {
        return reviewRepository.findByProductIdAndUserId(productId, userId).stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ReviewDto> getAllJPQLByProductIdAndUserId(int productId, int userId) {
        return reviewRepository.findJPQLByProductIdAndUserId(productId, userId).stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private ReviewDto convertToDto(Review review) {
        ReviewDto reviewDto = modelMapper.map(review, ReviewDto.class);
        return reviewDto;
    }
}
