package com.example.springdata.dto;

import lombok.Data;

@Data
public class ProductCreatedByDto {
    private int id;

    private String email;

    private String firstName;

    private String lastName;
}
