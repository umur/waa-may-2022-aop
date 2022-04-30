package com.shop.association.service;

import com.shop.association.domain.bidirection.joincolumn.User3;

import java.util.List;

public interface User3Service {
    void save(User3 user3);

    void update(User3 user3, int id);

    void delete(int id);

    List<User3> getAll();

    User3 getById(int id);
}
