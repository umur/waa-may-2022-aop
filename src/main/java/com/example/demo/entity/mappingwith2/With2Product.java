package com.example.demo.entity.mappingwith2;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class With2Product {
    @Id
    private int id;
    private String name;
    private  double price;
    private  double rating;
    @ManyToOne
    private With2Category category;
}
