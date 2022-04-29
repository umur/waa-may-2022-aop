package edu.miu.springdata.DTO;

import lombok.Data;

@Data
public class ProductDto {

    private int id;

    private String name;
    private float price;
    private int rating;

}
