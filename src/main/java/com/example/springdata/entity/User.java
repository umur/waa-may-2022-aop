package com.example.springdata.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @SequenceGenerator(name = "samples_id_seq", sequenceName = "samples_id_seq", initialValue = 8, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "samples_id_seq")
    private int id;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    @OneToOne(mappedBy = "user", cascade = CascadeType.PERSIST)
    private Address address;

//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Review> reviews;

    public void setAddress(Address address) {
        this.address = address;
    }
}
