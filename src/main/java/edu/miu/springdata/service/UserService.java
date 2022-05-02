package edu.miu.springdata.service;


import edu.miu.springdata.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto save(UserDto user);

    List<UserDto> findAll();

    UserDto findById(Long id);

    void deleteById(Long id);

}
