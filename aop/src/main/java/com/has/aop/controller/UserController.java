package com.has.aop.controller;


import com.has.aop.dto.ProductDto;
import com.has.aop.dto.UserDto;
import com.has.aop.entity.Product;
import com.has.aop.entity.User;
import com.has.aop.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public void save(@RequestBody User p) {
        userService.save(p);
    }
    @DeleteMapping
    public void deleteById(@RequestParam int p) {
        userService.delete(p);
    }
    @GetMapping
    public ResponseEntity<List<UserDto>> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }
    @GetMapping("/{id}")
    public UserDto getById(@RequestParam int id) {
        return userService.getById(id);
    }

}
