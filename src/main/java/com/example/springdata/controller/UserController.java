package com.example.springdata.controller;

import com.example.springdata.annotation.LogExecutionTime;
import com.example.springdata.dto.AddUserDto;
import com.example.springdata.dto.UserDto;
import com.example.springdata.entity.User;
import com.example.springdata.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @PostMapping
    @LogExecutionTime
    public ResponseEntity<UserDto> save(@RequestBody AddUserDto userDto) throws ParseException {
        UserDto user = userService.save(userDto);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }
}
