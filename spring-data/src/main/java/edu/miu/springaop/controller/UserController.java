package edu.miu.springaop.controller;

import edu.miu.springaop.DTO.UserDto;
import edu.miu.springaop.aspect.annotation.ExecutionTime;
import edu.miu.springaop.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ExecutionTime
    @PostMapping
    public void save(@RequestBody UserDto u) {
        userService.save(u);
    }
    @ExecutionTime
    @GetMapping
    public List<UserDto> getAll() {
        return userService.getAll();
    }

    @ExecutionTime
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getById(@PathVariable int id) {
        return ResponseEntity.ok(userService.getById(id));
    }

    @ExecutionTime
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        userService.deleteById(id);
    }

}
