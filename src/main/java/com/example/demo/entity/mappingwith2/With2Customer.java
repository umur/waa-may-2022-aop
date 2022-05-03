package com.example.demo.entity.mappingwith2;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class With2Customer {
    @Id
    private int id;
    private  String email;
    private String  password;
    private String firstName;
    private String lastname;
    @OneToMany
   @JoinColumn(name = "customer_id")
    private List<With2Review> reviews;
    @OneToOne
    @JoinColumn(name = "address_id")
    private With2Address address;
}
