package com.example.demo.entity.unidirect;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class UniReview {
    @Id
    private  int id;
    private String comment;

}
