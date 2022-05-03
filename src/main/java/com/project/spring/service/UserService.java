package com.project.spring.service;

import com.project.spring.entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<Users> getAll();

    void save(Users user);

}
