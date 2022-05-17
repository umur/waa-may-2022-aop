package com.example.aopass03.service.Impl;

import com.example.aopass03.dto.UserDto;
import com.example.aopass03.repository.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl {
    private UserRepo userRepo;

    @Override
    public List<UserDto> findAll(){
        return userRepo.findAll();
    }

    @Override
    public UserDto findById(int id){
        return userRepo.findById(id);
    }

    @Override
    public UserDto save(UserDto user){
        return userRepo.save(user);
    }

    @Override
    public UserDto update(UserDto user, int id){
        return userRepo.update(user,id);
    }

    @Override
    public void remove(int id){
        return userRepo.remove(id);
    }
}
