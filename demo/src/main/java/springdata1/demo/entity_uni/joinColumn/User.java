package springdata1.demo.entity_uni.joinColumn;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;
    private String password;
    private String firstname;
    private String lastname;

    @OneToMany
    @JoinColumn
    private List<Review> reviews;

    @OneToOne
    @JoinColumn
    private Address address;

}
