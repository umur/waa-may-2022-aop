package com.project.spring.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String comment;

    @ManyToOne
    private Users user;

}
