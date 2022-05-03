package com.project.spring.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String street;
    private String zip;
    private String city;

    @OneToOne
    private Users user;


}
