package com.example.lab2.Spring.Data.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
//
//    @JoinColumn
//    @OneToMany
//    private List<Product> products;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
