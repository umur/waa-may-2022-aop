package com.project.spring.controller;

import com.project.spring.entity.Users;
import com.project.spring.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<Users> getAll() {
        return userService.getAll();
    }

    @PostMapping
    public void save(@RequestBody Users user) {
        userService.save(user);
    }
}
