package com.example.aopass03.service.Impl;

import com.example.aopass03.dto.ProductDto;
import com.example.aopass03.repository.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
import java.util.List;

public class ProductServiceImpl {
    private ProductRepo productRepo;

    @Override
    public List<ProductDto> findAll(){
        return productRepo.findAll();
    }

    @Override
    public ReviewDto findById(int id){
        return productRepo.findById(id);
    }

    @Override
    public ReviewDto save(ProductDto review){
        return productRepo.save(review);
    }

    @Override
    public ReviewDto update(ProductDto review, int id){
        return productRepo.update(review,id);
    }

    @Override
    public void remove(int id){
        return productRepo.remove(id);
    }
}
