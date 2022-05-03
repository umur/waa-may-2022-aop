package com.example.demo.entity.mappingwith;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class WithCustomer {
    @Id
    private int id;
    private  String email;
    private String  password;
    private String firstName;
    private String lastname;
    @OneToMany
   @JoinTable(name = "with_customer_review")
    private List<WithReview> reviews;
    @OneToOne
    @JoinTable(name = "with_customer_address")
    private WithAddress address;
}
