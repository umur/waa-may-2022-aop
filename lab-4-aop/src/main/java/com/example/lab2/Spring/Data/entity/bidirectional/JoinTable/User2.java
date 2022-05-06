package com.example.lab2.Spring.Data.entity.bidirectional.JoinTable;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
public class User2 {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany
    private List<Review2> reviews;
    @OneToOne
    private Address2 address;

}
