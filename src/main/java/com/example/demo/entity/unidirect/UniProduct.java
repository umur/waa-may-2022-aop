package com.example.demo.entity.unidirect;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class UniProduct {
    @Id
    private int id;
    private String name;
    private  double price;
    private  double rating;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private UniCategory category;
}
