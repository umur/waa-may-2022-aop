package com.example.lab2.Spring.Data.entity.bidirectional.JoinColumn;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
public class User1 {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany
    private List<Review1> reviews;
    @OneToOne
    private Address1 address;

}
