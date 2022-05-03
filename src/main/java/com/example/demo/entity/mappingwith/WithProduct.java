package com.example.demo.entity.mappingwith;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class WithProduct {
    @Id
    private int id;
    private String name;
    private  double price;
    private  double rating;
    @ManyToOne
    private WithCategory category;
}
