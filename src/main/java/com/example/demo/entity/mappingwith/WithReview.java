package com.example.demo.entity.mappingwith;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class WithReview {
    @Id
    private  int id;
    private String comment;
    @ManyToOne
    private WithCustomer customer;
}
