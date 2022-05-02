package edu.miu.springaop.service;

import edu.miu.springaop.DTO.UserDto;

import java.util.List;

public interface UserService {
    void save(UserDto p);
    void deleteById(int id);
    UserDto getById(int id);
    List<UserDto> getAll();
}
