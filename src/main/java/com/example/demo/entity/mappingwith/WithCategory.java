package com.example.demo.entity.mappingwith;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class WithCategory {
    @Id
    private int id;
    private String name;
    @OneToMany(mappedBy = "category")
    private List<WithProduct> products;
}
