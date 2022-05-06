package com.example.lab2.Spring.Data.entity.bidirectional.JoinTable;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String comment;

    @JoinColumn
    @OneToOne
    private Review2 review;
}
