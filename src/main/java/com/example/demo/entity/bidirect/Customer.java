package com.example.demo.entity.bidirect;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@Data
public class Customer {
    @Id
    private int id;
    private  String email;
    private String  password;
    private String firstname;
    private String lastname;
    @OneToMany(mappedBy = "customer")
    private List<Review> reviews;
    @OneToOne
    private  Address address;
}
