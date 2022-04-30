package com.example.springdata.dto;

import com.example.springdata.entity.Address;
import com.example.springdata.entity.User;
import lombok.Data;

import java.util.List;

@Data
public class AddUserDto {
    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private AddAddressDto address;

//    private List<ReviewDto> reviews;
}
