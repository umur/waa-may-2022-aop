package com.example.lab4.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)

    private List<Review> reviewList;

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY)

    private Address address;


}
