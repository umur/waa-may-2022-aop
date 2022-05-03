package com.project.spring.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @OneToOne(mappedBy = "user")
    private Address address;

    @OneToMany(mappedBy = "user")
    private List<Review> reviewList;

}
