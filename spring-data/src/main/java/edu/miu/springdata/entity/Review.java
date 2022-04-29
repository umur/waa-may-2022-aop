package edu.miu.springdata.entity.bidirectional;

import edu.miu.springdata.DTO.ProductDto;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String comment;

    @ManyToOne
    private Product product;

    @ManyToOne
    private User user;
}
