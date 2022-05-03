package com.example.demo.entity.bidirect;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Review {
    @Id
    private  int id;
    private String comment;
    @ManyToOne
    @JsonBackReference
    private Customer customer;

    @ManyToOne
    @JsonBackReference
    private Product product;
}
