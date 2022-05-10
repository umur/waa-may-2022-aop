package springdata1.demo.entity_bidir.joinColumn;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String street;
    private String city;
    private String zip;

    @OneToOne(mappedBy = "address")
    private User user;

}
