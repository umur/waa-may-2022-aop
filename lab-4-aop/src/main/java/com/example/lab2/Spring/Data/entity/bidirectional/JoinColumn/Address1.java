package com.example.lab2.Spring.Data.entity.bidirectional.JoinColumn;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String street;
    private int zip;
    private String city;

    @OneToOne(mappedBy = "")
    private User1 user;
}
