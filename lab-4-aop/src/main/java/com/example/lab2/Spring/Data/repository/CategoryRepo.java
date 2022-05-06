package com.example.lab2.Spring.Data.repository;

import com.example.lab2.Spring.Data.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Integer> {

}
