package com.example.springdata.dto;

import com.example.springdata.entity.Address;
import lombok.Data;

@Data
public class AddAddressDto {
    private String street;

    private String city;

    private String zip;
}
