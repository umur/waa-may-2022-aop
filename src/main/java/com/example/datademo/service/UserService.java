package com.example.datademo.service;

import com.example.datademo.entity.Category;
import com.example.datademo.entity.Product;
import com.example.datademo.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public Iterable<User> getAll();

    public User getById(int id);

    public void update(User u, int id);

    public void delete(int id);

    public void save(User u);
}
