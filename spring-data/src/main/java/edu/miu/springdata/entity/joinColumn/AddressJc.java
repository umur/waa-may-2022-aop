package edu.miu.springdata.entity.joinColumn;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class AddressJc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String street;
    private String zip;
    private String city;

}
