package com.example.springdata.dto;

import com.example.springdata.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private int id;

    private String name;

    private Double price;

    private Double rating;

    private CategoryDto category;

    private ProductCreatedByDto createdBy;
}
