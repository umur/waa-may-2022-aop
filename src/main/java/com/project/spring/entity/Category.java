package com.project.spring.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Category {

    @Id
    private long id;
    private String name;

    @OneToMany
    @JoinColumn(name = "category_aid")
    private List<Product> productList;
}
