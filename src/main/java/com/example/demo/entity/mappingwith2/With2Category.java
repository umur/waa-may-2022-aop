package com.example.demo.entity.mappingwith2;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class With2Category {
    @Id
    private int id;
    private String name;
    @OneToMany(mappedBy = "category")
    private List<With2Product> products;
}
