package com.example.aopass03.controller;

import com.example.aopass03.dto.ReviewDto;
import com.example.aopass03.dto.UserDto;
import com.example.aopass03.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/reviews")
@AllArgsConstructor
public class ReviewController {
    ReviewService reviewService;

    @GetMapping
    public List<ReviewDto> getAll(){
        return reviewService.findAll();
    }

    @GetMapping("/{id}")
    public ReviewDto getById(@PathVariable int id){
        return reviewService.findById(id);
    }

    @PostMapping
    public ReviewDto save(@RequestBody ReviewDto review){
        return reviewService.save(review);
    }

    @PutMapping("/{id}")
    public ReviewDto update(@RequestBody ReviewDto review, int id){
        return reviewService.update(review, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        reviewService.remove(id);
    }
}
