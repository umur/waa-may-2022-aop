package com.example.lab2.Spring.Data.entity.unidirectional.JoinColumn;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Category3 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @OneToMany
    @JoinColumn
    private List<Product3> products;
}
