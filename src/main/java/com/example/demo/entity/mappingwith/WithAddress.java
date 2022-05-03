package com.example.demo.entity.mappingwith;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class WithAddress {
    @Id
    private int id;
    private  String street;
    private String zip;
    private String city;
    @OneToOne(mappedBy = "address")
    private WithCustomer customer;
}
