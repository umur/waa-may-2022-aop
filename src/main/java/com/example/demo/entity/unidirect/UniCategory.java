package com.example.demo.entity.unidirect;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class UniCategory {
    @Id
    private int id;
    private String name;

}
