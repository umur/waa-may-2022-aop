package com.example.demo.entity.mappingwith2;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class With2Address {
    @Id
    private int id;
    private  String street;
    private String zip;
    private String city;
    @OneToOne(mappedBy = "address")
    private With2Customer customer;
}
