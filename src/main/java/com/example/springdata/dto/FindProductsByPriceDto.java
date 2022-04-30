package com.example.springdata.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FindProductsByPriceDto {
    private Double price;
}
