package edu.miu.springdata.entity.joinTable;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class UserJt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
//    Uncomment for one to many unidirectional mapping
    @OneToMany
    private List<ReviewJt> reviews;

    @OneToOne
    private AddressJt address;
}
