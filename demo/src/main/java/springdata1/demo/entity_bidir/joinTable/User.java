package springdata1.demo.entity_bidir.joinTable;

import springdata1.demo.entity_uni.Product;
import springdata1.demo.entity_uni.joinTable.Address;
import springdata1.demo.entity_uni.joinTable.Review;

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
    @JoinTable
    private List<Review> reviews;

    @OneToOne
    @JoinTable
    private Address address;

    @OneToMany
    private List<Product> products;

}
