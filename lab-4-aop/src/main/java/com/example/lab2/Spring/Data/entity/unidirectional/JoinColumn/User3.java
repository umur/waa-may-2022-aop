package com.example.lab2.Spring.Data.entity.unidirectional.JoinColumn;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
public class User3 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @JoinColumn
    @OneToMany
    private List<Review3> reviews;

    @JoinColumn
    @OneToOne
    private Address3 address;

}
