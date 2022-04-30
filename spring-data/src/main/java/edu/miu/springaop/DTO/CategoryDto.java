package edu.miu.springaop.DTO;

import lombok.Data;

import java.util.List;

@Data
public class CategoryDto {
    private int id;
    private String name;
    private List<ProductDto> productUnis;
}
