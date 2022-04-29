package edu.miu.springdata.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private float price;
    private int rating;
    @ManyToOne
    private Category category;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="product_review")
    private List<Review> reviews;

}
