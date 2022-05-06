package com.example.aop.repo;

import com.example.aop.entity.Activity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepo extends CrudRepository<Activity, Integer> {
}
