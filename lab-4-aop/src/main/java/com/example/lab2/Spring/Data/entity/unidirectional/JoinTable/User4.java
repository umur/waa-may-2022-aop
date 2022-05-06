package com.example.lab2.Spring.Data.entity.unidirectional.JoinTable;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
public class User4 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany
    private List<Review4> reviews;

    @OneToOne
    private Address4 address;

}
