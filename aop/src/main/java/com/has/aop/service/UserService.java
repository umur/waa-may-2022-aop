package com.has.aop.service;

import com.has.aop.dto.ProductDto;

import com.has.aop.dto.UserDto;
import com.has.aop.entity.User;

import java.util.List;

public interface UserService {
    void save(User p);

    void delete(int id);

    UserDto getById(int id);

    List<UserDto> getAll();
}
