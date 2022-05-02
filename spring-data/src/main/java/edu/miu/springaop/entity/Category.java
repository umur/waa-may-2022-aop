package edu.miu.springaop.entity;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

}
