package com.project.spring.repository;

import com.project.spring.entity.Review;
import com.project.spring.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {

}
