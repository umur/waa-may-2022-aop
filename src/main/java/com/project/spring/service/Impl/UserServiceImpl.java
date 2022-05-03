package com.project.spring.service.Impl;

import com.project.spring.entity.Users;
import com.project.spring.repository.UserRepository;
import com.project.spring.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<Users> getAll() {
        var entity = userRepository.findAll();

        var result = new ArrayList<Users>();
        entity.forEach(u -> {
            Users user = new Users();
            user.setId(u.getId());
            user.setFirstName(u.getFirstName());
            user.setLastName(u.getLastName());
            user.setAddress(u.getAddress());
            user.setEmail(u.getEmail());
            user.setPassword(u.getPassword());
            user.setReviewList(u.getReviewList());

            result.add(user);
        });
        return result;
    }

    @Override
    public void save(Users user) {
        userRepository.save(user);
    }
}
