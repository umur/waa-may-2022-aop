package com.example.datademo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String comment;


    @ManyToOne
    @JsonIgnoreProperties("reviews")
    private User user;

    @ManyToOne
    @JoinColumn(name="product_id")
    @JsonIgnoreProperties("reviews")
    private Product product;

    @OneToMany(mappedBy = "product")
    @JsonIgnoreProperties("user")
    private List<Review> reviews;
}
