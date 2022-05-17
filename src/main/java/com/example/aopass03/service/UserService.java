package com.example.aopass03.service;

import com.example.aopass03.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> findAll();
    UserDto findById(int id);
    UserDto save(UserDto user);
    UserDto update(UserDto user, int id);
    void remove(int id);
}
