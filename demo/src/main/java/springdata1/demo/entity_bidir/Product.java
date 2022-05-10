package springdata1.demo.entity_bidir;

import springdata1.demo.entity_bidir.joinColumn.Review;
import springdata1.demo.entity_bidir.joinColumn.User;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private float price;
    private float rating;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "product")
    private List<Review> reviews;

}
