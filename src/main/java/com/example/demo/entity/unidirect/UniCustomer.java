package com.example.demo.entity.unidirect;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class UniCustomer {
    @Id
    private int id;
    private  String email;
    private String  password;
    private String firstName;
    private String lastname;
    @OneToMany
    @JoinColumn(name = "customer_id")
    private List<UniReview> reviews;
    @OneToOne
    @JoinColumn(name = "address_id")
    private UniAddress address;
}
