package com.example.lab2.Spring.Data.entity.unidirectional.JoinTable;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Category4 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @OneToMany
    private List<Product4> products;
}
