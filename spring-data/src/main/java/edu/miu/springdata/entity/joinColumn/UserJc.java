package edu.miu.springdata.entity.joinColumn;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class UserJc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
//    Uncomment for one to many unidirectional mapping
    @OneToMany
    @JoinColumn(name = "reviewId")
    private List<ReviewJc> reviews;

    @OneToOne
    @JoinColumn(name = "address_id")
    private AddressJc address;
}
