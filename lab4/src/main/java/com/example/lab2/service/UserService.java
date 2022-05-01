package com.example.lab2.service;

import com.example.lab2.dto.UserDTO;

import java.util.List;

public interface UserService {
    void save(UserDTO user);
    void delete(int id);
    void update(int id, UserDTO userDTO);
    List<UserDTO> getAll();
    UserDTO getById(int id);

}
