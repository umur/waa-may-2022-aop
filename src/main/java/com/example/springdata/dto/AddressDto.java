package com.example.springdata.dto;

import lombok.Data;

@Data
public class AddressDto {
    private int id;

    private String street;

    private String city;

    private String zip;
}
