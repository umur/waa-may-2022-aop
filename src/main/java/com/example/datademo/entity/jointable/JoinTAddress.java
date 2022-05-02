package com.example.datademo.entity.jointable;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="jointaddress")
public class JoinTAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String street;

    private String city;

    private String zip;

    @OneToOne
    private JoinTUser user;
}
