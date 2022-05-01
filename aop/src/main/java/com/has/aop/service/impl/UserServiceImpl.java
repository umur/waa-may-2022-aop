package com.has.aop.service.impl;

import com.has.aop.dto.ProductDto;
import com.has.aop.dto.UserDto;
import com.has.aop.entity.User;
import com.has.aop.repository.UserRepo;
import com.has.aop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;

    @Override
    public void save(User p) {
        userRepo.save(p);
    }

    @Override
    public void delete(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public UserDto getById(int id) {
        UserDto result = new UserDto();
        var item = userRepo.findById(id).get();
        result.setEmail(item.getEmail());
        result.setFirstName(item.getFirstName());
        result.setLastname(item.getLastname());
        result.setId(item.getId());
        result.setPassword(item.getPassword());
        return result;
    }

    @Override
    public List<UserDto> getAll() {
        var result= new ArrayList<UserDto>();
        userRepo.findAll().forEach(item -> {
            UserDto p = new UserDto();
            p.setId(item.getId());
            p.setFirstName(item.getFirstName());
            p.setLastname(item.getLastname());
            p.setEmail(item.getEmail());
            p.setPassword(p.getPassword());
            result.add(p);
        });

        return result;
    }
}
