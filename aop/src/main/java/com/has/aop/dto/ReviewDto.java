package com.has.aop.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.has.aop.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReviewDto {
    private int id;
    private String comment;
    private int numberOfStars;

    private Product product;

}
