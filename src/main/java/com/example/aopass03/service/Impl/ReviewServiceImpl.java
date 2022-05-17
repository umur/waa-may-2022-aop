package com.example.aopass03.service.Impl;

import com.example.aopass03.dto.ReviewDto;
import com.example.aopass03.repository.ReviewRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReviewServiceImpl {
    private ReviewRepo reviewRepo;

    @Override
    public List<ReviewDto> findAll(){
        return reviewRepo.findAll();
    }

    @Override
    public ReviewDto findById(int id){
        return reviewRepo.findById(id);
    }

    @Override
    public ReviewDto save(ReviewDto review){
        return reviewRepo.save(review);
    }

    @Override
    public ReviewDto update(ReviewDto review, int id){
        return reviewRepo.update(review,id);
    }

    @Override
    public void remove(int id){
        return reviewRepo.remove(id);
    }
}
