package com.example.lab2.Spring.Data.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany
    private List<Review> reviews;
    @OneToOne
    private Address address;

}
