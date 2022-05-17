package com.example.aopass03.controller;

import com.example.aopass03.dto.UserDto;
import com.example.aopass03.service.ReviewService;
import com.example.aopass03.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    UserService userService;

    @GetMapping
    public List<UserDto> getAll(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable int id){
        return userService.findById(id);
    }

    @PostMapping
    public UserDto save(@RequestBody UserDto user){
        return userService.save(user);
    }

    @PutMapping("/{id}")
    public UserDto update(@RequestBody UserDto user, int id){
        return userService.update(user, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        userService.remove(id);
    }

}
