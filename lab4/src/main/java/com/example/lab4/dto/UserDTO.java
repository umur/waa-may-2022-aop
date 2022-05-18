package com.example.lab4.dto;

import com.example.lab4.domain.Address;
import com.example.lab4.domain.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private int id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private List<Review> reviewList;
    private Address address;
}
