package com.example.datademo.controller;

import com.example.datademo.entity.Address;
import com.example.datademo.entity.User;
import com.example.datademo.service.AddressService;
import com.example.datademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/v1/users")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody User p){
        userService.save(p);
        return ResponseEntity.ok("Success");
    }
    @GetMapping
    public ResponseEntity<Iterable<User>> getAll(){
        Iterable<User> list = userService.getAll();
        return ResponseEntity.ok(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getByID(@PathVariable int id){
        User p = userService.getById(id);
        return ResponseEntity.ok(p);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> update(@RequestBody User p ,@PathVariable int id){
        userService.update(p,id);
        return ResponseEntity.ok("Success");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        userService.delete(id);
        return ResponseEntity.ok("Success");
    }
}
