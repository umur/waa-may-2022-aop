package com.has.aop.entity.joinedcolumn;

import com.has.aop.entity.Address;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class UserJoinedColumn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastname;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
