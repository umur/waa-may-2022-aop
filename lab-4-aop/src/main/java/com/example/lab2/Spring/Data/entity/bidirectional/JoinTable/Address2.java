package com.example.lab2.Spring.Data.entity.bidirectional.JoinTable;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String street;
    private int zip;
    private String city;

    @JoinColumn
    @OneToOne
    private User2 user;
}
