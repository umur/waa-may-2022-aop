package com.example.aop.service;

import com.example.aop.entity.User;

import java.util.List;
import java.util.Optional;


public interface UserService {

    List<User> getAll();

    Optional<User> getUserById(int id);

    void create(User user);

    void update(User user, int id);

    void delete(int id);
}
