package com.example.lab2.Spring.Data.entity.bidirectional.JoinColumn;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String comment;

    @JoinColumn
    @OneToOne
    private Review1 review;
}
