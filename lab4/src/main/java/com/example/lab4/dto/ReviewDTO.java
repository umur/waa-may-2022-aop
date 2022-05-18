package com.example.lab4.dto;

import com.example.lab4.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDTO {
    private int id;
    private String comment;
    private User user;
}
