package edu.miu.springdata.entity.unidirectional;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ReviewUni {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String comment;

}
