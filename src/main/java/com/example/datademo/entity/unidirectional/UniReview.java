package com.example.datademo.entity.unidirectional;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="unireview")
public class UniReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String comment;
}
