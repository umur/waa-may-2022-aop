package com.example.demo.entity.unidirect;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class UniAddress {
    @Id
    private int id;
    private  String street;
    private String zip;
    private String city;

}
