package edu.miu.springdata.entity.joinTable;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class AddressJt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String street;
    private String zip;
    private String city;

}
