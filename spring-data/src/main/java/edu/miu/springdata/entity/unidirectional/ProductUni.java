package edu.miu.springdata.entity.unidirectional;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ProductUni {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private float price;
    private int rating;

}
