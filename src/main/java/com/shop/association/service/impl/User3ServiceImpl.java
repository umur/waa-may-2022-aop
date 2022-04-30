package com.shop.association.service.impl;

import com.shop.association.aspect.ExecutionTime;
import com.shop.association.domain.bidirection.joincolumn.User3;
import com.shop.association.repository.User3Repo;
import com.shop.association.service.User3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class User3ServiceImpl implements User3Service {

    private final User3Repo user3Repo;

    @Override
    public void save(User3 user3) {
        user3Repo.save(user3);
    }

    @Override
    public void update(User3 user3, int id) {
        user3.setId(id);
        user3Repo.save(user3);
    }

    @Override
    public void delete(int id) {
        user3Repo.deleteById(id);
    }

    @Override
    public List<User3> getAll() {
        return (List<User3>) user3Repo.findAll();
    }

    @Override
    @ExecutionTime
    public User3 getById(int id) {
        return user3Repo.findById(id).orElse(null);
    }
}
