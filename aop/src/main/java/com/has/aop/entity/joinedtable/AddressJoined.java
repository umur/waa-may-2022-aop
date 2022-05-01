package com.has.aop.entity.joinedtable;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class AddressJoined extends UserJoined {
    private String street;
    private String city;
    private  int zip;
}
