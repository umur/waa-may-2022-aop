package com.example.springdata.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {

    @Id
    @SequenceGenerator(name = "samples_id_seq", sequenceName = "samples_id_seq", initialValue = 8, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "samples_id_seq")
    private int id;

    private String name;

    private Double price;

    private Double rating;

    @JsonIgnoreProperties("products")
    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;

    @JsonIgnoreProperties("category")
    @OneToMany(mappedBy = "product")
    private List<Review> reviews;

    @ManyToOne
    private User createdBy;
}
