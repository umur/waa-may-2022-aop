package com.example.lab2.Spring.Data.entity.bidirectional.JoinColumn;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private float price;
    private int rating;

    @JoinColumn
    @OneToOne
    private Category1 category;
}
