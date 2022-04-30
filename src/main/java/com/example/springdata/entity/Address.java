package com.example.springdata.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
public class Address {

    @Id
    @SequenceGenerator(name = "samples_id_seq", sequenceName = "samples_id_seq", initialValue = 8, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "samples_id_seq")
    private int id;

    private String street;

    private String city;

    private String zip;

    @OneToOne
    @JsonIgnore
    private User user;

    public void setUser(User user) {
        this.user = user;
    }
}
