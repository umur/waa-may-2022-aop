package com.example.demo.entity.mappingwith2;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class With2Review {
    @Id
    private  int id;
    private String comment;
    @ManyToOne
    private With2Customer customer;
}
