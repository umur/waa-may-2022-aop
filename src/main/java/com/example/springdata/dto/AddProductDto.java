package com.example.springdata.dto;

import com.example.springdata.entity.Category;
import lombok.Data;

import javax.persistence.ManyToOne;

@Data
public class AddProductDto {
    private String name;

    private Double price;

    private Double rating;

    private int categoryId;

    private int createdBy;
}
