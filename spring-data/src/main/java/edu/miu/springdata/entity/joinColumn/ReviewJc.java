package edu.miu.springdata.entity.joinColumn;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ReviewJc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String comment;

}
