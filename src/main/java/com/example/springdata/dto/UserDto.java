package com.example.springdata.dto;

import com.example.springdata.entity.Address;
import com.example.springdata.entity.Review;
import com.example.springdata.entity.User;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Data
public class UserDto {
    private int id;

    private String email;

//    private String password;

    private String firstName;

    private String lastName;

    private AddressDto address;

//    private List<AddReviewDto> reviews;
}
