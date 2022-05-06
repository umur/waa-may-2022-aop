package com.example.lab2.Spring.Data.entity.bidirectional.JoinTable;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private float price;
    private int rating;

    @JoinColumn
    @OneToOne
    private Category2 category;
}
