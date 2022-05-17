package com.example.aopass03.repository;

import com.example.aopass03.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
}
