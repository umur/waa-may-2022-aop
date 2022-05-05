package com.has.aop.service.impl;

import com.has.aop.dto.ProductDto;
import com.has.aop.entity.Product;
import com.has.aop.repository.ProductRepo;
import com.has.aop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;


    @Override
    public void save(Product p) {
        productRepo.save(p);
    }

    @Override
    public void delete(int id) {
       productRepo.deleteById(id);
    }

    @Override
    public ProductDto getById(int id) {
        ProductDto result = new ProductDto();
        var item = productRepo.findById(id).get();
        result.setId(item.getId());
        result.setName(item.getName());
        result.setPrice(item.getPrice());
        result.setRating(item.getRating());
        return result;
    }

    @Override
    public List<ProductDto> getAll() {
        var result= new ArrayList<ProductDto>();
        productRepo.findAll().forEach(item -> {
            ProductDto p = new ProductDto();
            p.setId(item.getId());
            p.setName(item.getName());
            p.setPrice(item.getPrice());
            p.setRating(item.getRating());
            result.add(p);
        });

        return result;
    }
}
