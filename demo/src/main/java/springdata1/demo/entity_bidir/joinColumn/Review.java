package springdata1.demo.entity_bidir.joinColumn;

import lombok.Data;
import springdata1.demo.entity_bidir.Product;

import javax.persistence.*;

@Entity
@Data
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String comment;

    @OneToOne(mappedBy = "reviews")
    private User user;

    @ManyToOne
    private Product product;

}
