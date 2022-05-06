package com.example.lab2.Spring.Data.entity.bidirectional.JoinTable;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Category2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @JoinColumn
    @OneToMany
    private List<Product2> products;
}
