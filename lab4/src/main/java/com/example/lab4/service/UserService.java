package com.example.lab4.service;

import com.example.lab4.dto.UserDTO;

import java.util.List;

public interface UserService {
    void save(UserDTO user);
    void delete(int id);
    void update(int id, UserDTO userDTO);
    List<UserDTO> getAll();
    UserDTO getById(int id);
}
