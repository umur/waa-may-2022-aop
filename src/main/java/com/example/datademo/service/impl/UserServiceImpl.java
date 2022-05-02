package com.example.datademo.service.impl;

import com.example.datademo.entity.Product;
import com.example.datademo.entity.Review;
import com.example.datademo.entity.User;
import com.example.datademo.repository.ReviewRepository;
import com.example.datademo.repository.UserRepository;
import com.example.datademo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(int id) {
        Optional<User> result = userRepository.findById(id);
        if(result.isPresent()){
            return result.get();
        }else{
            return null;
        }
    }

    @Override
    public void update(User u, int id) {
        User user = userRepository.findById(id).get();
        user.setId(u.getId());
        user.setAddress(u.getAddress());
        user.setEmail(u.getEmail());
        user.setFirstName(u.getFirstName());
        user.setLastName(u.getLastName());
        user.setPassword(u.getPassword());
        user.setReviews(u.getReviews());
        userRepository.save(user);
    }

    @Override
    public void delete(int id) {
        User user = userRepository.findById(id).get();
        userRepository.delete(user);
    }

    @Override
    public void save(User u) {
        userRepository.save(u);
    }
}
